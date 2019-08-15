package com.example.andronews2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andronews2.api.ApiClient;
import com.example.andronews2.shared.NewsShared;
import com.example.andronews2.shared.ResultsShared;
import com.example.andronews2.viewed.NewsViewed;
import com.example.andronews2.viewed.ResultsViewed;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.andronews2.MainActivity.period;

public class TabShared extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private String TAG = MainActivity.class.getSimpleName();

    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_View);
        mAdapter = new MyAdapter();
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

        LoadJsonShared();

        return rootView;
    }

    public void LoadJsonShared() {
        new ApiClient().getShared(period).enqueue(new Callback<NewsShared>() {

            @Override
            public void onResponse(Call<NewsShared> call, Response<NewsShared> response) {
                if (response.isSuccessful() && response.body().getResultsShared() != null) {
                    List<ResultsShared> resultsShared = response.body().getResultsShared());
                    mAdapter.setResultsSharedList(resultsShared);
                }
            }

            @Override
            public void onFailure(Call<NewsShared> call, Throwable t) {
                Log.e(TAG, "failed to load news", t);
            }
        });
    }
}
