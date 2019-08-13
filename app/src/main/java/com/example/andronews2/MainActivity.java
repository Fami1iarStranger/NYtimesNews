package com.example.andronews2;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;
import android.support.v4.view.ViewPager;
import com.example.andronews2.api.ApiClient;
import com.example.andronews2.viewed.MediaMetaDataViewed;
import com.example.andronews2.viewed.NewsViewed;
import com.example.andronews2.viewed.ResultsViewed;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static String period = "1";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    private List<ResultsViewed> resultsVieweds = new ArrayList<>();
    private List<MediaMetaDataViewed> mImage = new ArrayList<>();

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        //RecyclerView
        recyclerView = findViewById(R.id.recycler_View);
        layoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(this, resultsVieweds, mImage);

        //ошибки
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

       LoadJson();

    }

    public void LoadJson() {
        new ApiClient().getViewed(period).enqueue(new Callback<NewsViewed>() {

            @Override
            public void onResponse(@NotNull Call<NewsViewed> call, @NotNull Response<NewsViewed> response) {
                if (response.isSuccessful() && response.body().getResultsViewed() != null) {

                    if (!resultsVieweds.isEmpty()) {
                        resultsVieweds.clear();
                    }

                    resultsVieweds = response.body().getResultsViewed();
                    mAdapter.notifyDataSetChanged();

                } else {
                    Toast.makeText(MainActivity.this, "No Result!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<NewsViewed> call, @NotNull Throwable t) {
                Log.e(TAG, "failed to load news", t);
            }
        });
    }
}
