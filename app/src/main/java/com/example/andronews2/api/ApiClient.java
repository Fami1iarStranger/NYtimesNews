package com.example.andronews2.api;

import com.example.andronews2.emailed.News;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "https://api.nytimes.com";

    private static final String API_KEY = "r8EXYsSAEXcpM27gAUlXwaWAoLJ6NL2M";

    private final ApiInterface api;

    public ApiClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.level(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(ApiInterface.class);
    }

    public Call<com.example.andronews2.viewed.News> getViewed(String period) {
        return api.getViewed(period, API_KEY);
    }

    public Call<News> getEmailed(String period) {
        return api.getEmailed(period, API_KEY);
    }

    public Call<com.example.andronews2.shared.News> getShared(String period) {
        return api.getShared(period, API_KEY);
    }
}
