package com.example.andronews2.api;

import com.example.andronews2.emailed.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/svc/mostpopular/v2/viewed/{period}.json")
    Call<com.example.andronews2.viewed.News> getViewed(@Path("period") String period, @Query("api-key") String key);

    @GET("/svc/mostpopular/v2/emailed/{period}.json")
    Call<News> getEmailed(@Path("period") String period, @Query("api-key") String key);

    @GET("/svc/mostpopular/v2/shared/{period}.json")
    Call<com.example.andronews2.shared.News> getShared(@Path("period") String period, @Query("api-key") String key);
}
