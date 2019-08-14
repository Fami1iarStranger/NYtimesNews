package com.example.andronews2.viewed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsViewed {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("copyright")
    @Expose
    private String copyright;

    @SerializedName("num_results")
    @Expose
    private int num_results;

    @SerializedName("results")
    @Expose
    private List<ResultsViewed> resultsViewed;

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public int getNum_results() {
        return num_results;
    }

    public List<ResultsViewed> getResultsViewed() {
        return resultsViewed;
    }

}
