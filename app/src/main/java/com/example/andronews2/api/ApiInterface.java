package com.example.andronews2.api;

import com.example.andronews2.viewed.NewsViewed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("viewed")
    Call<NewsViewed> getViewed(

            @Query("PERIOD") String period  ,
            @Query("YOUR_API_KEY") String API_KEY
    );
}
