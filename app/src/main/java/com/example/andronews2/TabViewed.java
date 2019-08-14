package com.example.andronews2;

import android.content.Context;
import android.graphics.Color;
        import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

import com.example.andronews2.api.ApiClient;
import com.example.andronews2.viewed.MediaMetaDataViewed;
import com.example.andronews2.viewed.NewsViewed;
import com.example.andronews2.viewed.ResultsViewed;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.andronews2.MainActivity.period;

public class TabViewed extends Fragment {

    private RecyclerView recyclerView;
    private List<ResultsViewed> resultsVieweds;
    private List<MediaMetaDataViewed> mImage;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private String TAG = MainActivity.class.getSimpleName();
    private Context context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_View);
        mAdapter = new MyAdapter(context, resultsVieweds, mImage);
        layoutManager = new LinearLayoutManager(context);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

        LoadJson();

        return rootView;
    }

    public void LoadJson() {
        new ApiClient().getViewed(period).enqueue(new Callback<NewsViewed>() {

            @Override
            public void onResponse(Call<NewsViewed> call, Response<NewsViewed> response) {
                if (response.isSuccessful() && response.body().getResultsViewed() != null) {

                    if (!resultsVieweds.isEmpty()) {
                        resultsVieweds.clear();
                    }

                    resultsVieweds = response.body().getResultsViewed();
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<NewsViewed> call, Throwable t) {
                Log.e(TAG, "failed to load news", t);
            }
        });
    }
}
