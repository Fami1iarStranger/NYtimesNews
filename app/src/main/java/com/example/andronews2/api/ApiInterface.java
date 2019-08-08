package com.example.andronews2.api;

import com.example.andronews2.viewed.NewsViewed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/viewed/{period}.json")
    Call<NewsViewed> getViewed(

            @Path("period") String period,
            @Query("api-key") String API_KEY
    );
}
