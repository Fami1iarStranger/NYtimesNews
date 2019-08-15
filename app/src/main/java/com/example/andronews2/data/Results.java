package com.example.andronews2.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Results {

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("published_date")
    @Expose
    private String published_date;

    @SerializedName("adx_keywords")
    @Expose
    private String adx_keywords;

    @SerializedName("column")
    @Expose
    private String column;

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("id")
    @Expose
    private long id;

    @SerializedName("asset_id")
    @Expose
    private long asset_id;

    @SerializedName("byline")
    @Expose
    private String byline;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("abstract")
    @Expose
    private String abstractNews;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("media")
    @Expose
    private List<Media> media;

    public String getUrl() {
        return url;
    }

    public String getAdx_keywords() {
        return adx_keywords;
    }

    public String getColumn() {
        return column;
    }

    public String getSection() {
        return section;
    }

    public long getId() {
        return id;
    }

    public long getAsset_id() {
        return asset_id;
    }

    public String getByline() {
        return byline;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getAbstractNews() {
        return abstractNews;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getSource() {
        return source;
    }

    public List<Media> getMedia() {
        return media;
    }
}
