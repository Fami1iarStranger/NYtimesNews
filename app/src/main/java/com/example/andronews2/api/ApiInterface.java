package com.example.andronews2.api;

import com.example.andronews2.emailed.NewsEmailed;
import com.example.andronews2.shared.NewsShared;
import com.example.andronews2.viewed.NewsViewed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/svc/mostpopular/v2/viewed/{period}.json")
    Call<NewsViewed> getViewed(@Path("period") String period, @Query("api-key") String key);

    @GET("/svc/mostpopular/v2/emailed/{period}.json")
    Call<NewsEmailed> getEmailed(@Path("period") String period, @Query("api-key") String key);

    @GET("/svc/mostpopular/v2/shared/{period}.json")
    Call<NewsShared> getShared(@Path("period") String period, @Query("api-key") String key);
}
