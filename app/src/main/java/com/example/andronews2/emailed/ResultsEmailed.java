package com.example.andronews2.emailed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultsEmailed {

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("adx_keywords")
    @Expose
    private String adx_keywords;

    @SerializedName("subsection")
    @Expose
    private String subsection;

    @SerializedName("email_count")
    @Expose
    private int email_count;

    @SerializedName("count_type")
    @Expose
    private String count_type;

    @SerializedName("column")
    @Expose
    private String column;

    @SerializedName("eta_id")
    @Expose
    private int eta_id;

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("asset_id")
    @Expose
    private int asset_id;

    @SerializedName("nytdsection")
    @Expose
    private String nytdsection;

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

    @SerializedName("updated")
    @Expose
    private String updated;

    @SerializedName("des_facet")
    @Expose
    private List<String> des_facet;

    @SerializedName("org_facet")
    @Expose
    private List<String> org_facet;

    @SerializedName("per_facet")
    @Expose
    private List<String> per_facet;

    @SerializedName("geo_facet")
    @Expose
    private List<String>  geo_facet;

    @SerializedName("media")
    @Expose
    private List<MediaEmailed> mediaEmailed;

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

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public int getEmail_count() {
        return email_count;
    }

    public void setEmail_count(int email_count) {
        this.email_count = email_count;
    }

    public String getCount_type() {
        return count_type;
    }

    public void setCount_type(String count_type) {
        this.count_type = count_type;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public int getEta_id() {
        return eta_id;
    }

    public void setEta_id(int eta_id) {
        this.eta_id = eta_id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(int asset_id) {
        this.asset_id = asset_id;
    }

    public String getNytdsection() {
        return nytdsection;
    }

    public void setNytdsection(String nytdsection) {
        this.nytdsection = nytdsection;
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

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public List<String> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(List<String> des_facet) {
        this.des_facet = des_facet;
    }

    public List<String> getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(List<String> org_facet) {
        this.org_facet = org_facet;
    }

    public List<String> getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(List<String> per_facet) {
        this.per_facet = per_facet;
    }

    public List<String> getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(List<String> geo_facet) {
        this.geo_facet = geo_facet;
    }

    public List<MediaEmailed> getMediaEmailed() {
        return mediaEmailed;
    }

    public void setMediaEmailed(List<MediaEmailed> mediaEmailed) {
        this.mediaEmailed = mediaEmailed;
    }
}
