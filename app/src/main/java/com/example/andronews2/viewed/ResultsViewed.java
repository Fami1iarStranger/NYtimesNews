package com.example.andronews2.viewed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultsViewed {

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("adx_keywords")
    @Expose
    private String adx_keywords;

    @SerializedName("column")
    @Expose
    private String column;

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("byline")
    @Expose
    private String byline;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("abstract")
    @Expose
    private String abstractNews;

    @SerializedName("published_date")
    @Expose
    private String published_date;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("id")
    @Expose
    private long id;

    @SerializedName("asset_id")
    @Expose
    private long asset_id;

    @SerializedName("views")
    @Expose
    private int views;

    @SerializedName("des_facet")
    @Expose
    private List<String> des_facet;

    @SerializedName("media")
    @Expose
    private List<MediaViewed> mediaViewed;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAdx_keywords() {
        return adx_keywords;
    }

    public void setAdx_keywords(String adx_keywords) {
        this.adx_keywords = adx_keywords;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractNews() {
        return abstractNews;
    }

    public void setAbstractNews(String abstractNews) {
        this.abstractNews = abstractNews;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(int asset_id) {
        this.asset_id = asset_id;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public List<String> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(List<String> des_facet) {
        this.des_facet = des_facet;
    }

    public List<MediaViewed> getMediaViewed() {
        return mediaViewed;
    }

    public void setMediaViewed(List<MediaViewed> mediaViewed) {
        this.mediaViewed = mediaViewed;
    }
}
