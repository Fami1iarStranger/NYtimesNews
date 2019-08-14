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
    private long asset_id;

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

    public String getAdx_keywords() {
        return adx_keywords;
    }

    public String getSubsection() {
        return subsection;
    }

    public int getEmail_count() {
        return email_count;
    }

    public String getCount_type() {
        return count_type;
    }

    public String getColumn() {
        return column;
    }

    public int getEta_id() {
        return eta_id;
    }

    public String getSection() {
        return section;
    }

    public int getId() {
        return id;
    }

    public String getNytdsection() {
        return nytdsection;
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

    public String getUpdated() {
        return updated;
    }

    public List<String> getDes_facet() {
        return des_facet;
    }

    public List<String> getOrg_facet() {
        return org_facet;
    }

    public List<String> getPer_facet() {
        return per_facet;
    }

    public List<String> getGeo_facet() {
        return geo_facet;
    }

    public List<MediaEmailed> getMediaEmailed() {
        return mediaEmailed;
    }
}
