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
import com.example.andronews2.viewed.NewsViewed;
import com.example.andronews2.viewed.ResultsViewed;
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

        LoadJson();

        return rootView;
    }

    public void LoadJson() {
        new ApiClient().getViewed(period).enqueue(new Callback<NewsViewed>() {

            @Override
            public void onResponse(Call<NewsViewed> call, Response<NewsViewed> response) {
                if (response.isSuccessful() && response.body().getResultsViewed() != null) {

                    List<ResultsViewed> resultsViewed = response.body().getResultsViewed();
                    //List<MediaMetaDataViewed> mediaMetaDataViewed = response.body().getMediaMetaDataViewed();

                    mAdapter.setResultsViewedList(resultsViewed);
                    //mAdapter.setmImage(mediaMetaDataViewed);
                }
            }

            @Override
            public void onFailure(Call<NewsViewed> call, Throwable t) {
                Log.e(TAG, "failed to load news", t);
            }
        });
    }
}
