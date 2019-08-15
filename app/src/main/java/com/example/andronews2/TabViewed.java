package com.example.andronews2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.andronews2.api.ApiClient;
import com.example.andronews2.viewed.News;
import com.example.andronews2.viewed.Results;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import static com.example.andronews2.MainActivity.period;

public class TabViewed extends Fragment {

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

        LoadJsonViewed();

        return rootView;
    }

    public void LoadJsonViewed() {
        new ApiClient().getViewed(period).enqueue(new Callback<News>() {

            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                if (response.isSuccessful() && response.body().getResults() != null) {
                    List<Results> results = response.body().getResults();
                    mAdapter.setResultsList(results);
                }
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                Log.e(TAG, "failed to load news", t);
            }
        });
    }
}
