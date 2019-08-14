package com.example.andronews2.viewed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaViewed {

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("subtype")
    @Expose
    private String subtype;

    @SerializedName("caption")
    @Expose
    private String caption;

    @SerializedName("copyright")
    @Expose
    private String copyright;

    @SerializedName("approved_for_syndication")
    @Expose
    private long approved_for_syndication;

    @SerializedName("media-metadata")
    @Expose
    private List<MediaMetaDataViewed> mediaMetaDataViewed;

    public String getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getCaption() {
        return caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public long isApproved_for_syndication() {
        return approved_for_syndication;
    }

    public List<MediaMetaDataViewed> getMediaMetaDataViewed() {
        return mediaMetaDataViewed;
    }
}
