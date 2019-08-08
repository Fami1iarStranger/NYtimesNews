package com.example.andronews2;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.andronews2.api.ApiClient;
import com.example.andronews2.api.ApiInterface;
import com.example.andronews2.viewed.NewsViewed;
import com.example.andronews2.viewed.ResultsViewed;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity  {

    public static final String API_KEY = "r8EXYsSAEXcpM27gAUlXwaWAoLJ6NL2M";
    public static final String period = "1";
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<ResultsViewed> resultsVieweds = new ArrayList<>();
    private Adapter adapter;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewViewed);

        //переписал
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Viewed"));
        tabLayout.addTab(tabLayout.newTab().setText("Emailed"));
        tabLayout.addTab(tabLayout.newTab().setText("Shared"));

        LoadJson();
    }

    public void LoadJson() {

        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<NewsViewed> call;
        call = apiInterface.getViewed(period, API_KEY);

        call.enqueue(new Callback<NewsViewed>() {
            @Override
            public void onResponse(Call<NewsViewed> call, Response<NewsViewed> response) {
                if(response.isSuccessful() && response.body().getResultsViewed() != null) {

                    if(ResultsViewed.isEmpty())
                }
            }

            @Override
            public void onFailure(Call<NewsViewed> call, Throwable t) {

            }
        });



    }

}
