package com.example.andronews2.emailed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsEmailed {

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
    private List<ResultsEmailed> resultsEmailed;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public List<ResultsEmailed> getResultsEmailed() {
        return resultsEmailed;
    }

    public void setResultsEmailed(List<ResultsEmailed> resultsEmailed) {
        this.resultsEmailed = resultsEmailed;
    }
}
