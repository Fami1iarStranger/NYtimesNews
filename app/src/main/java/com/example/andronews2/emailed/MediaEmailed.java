package com.example.andronews2.emailed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaEmailed {

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
    private boolean approved_for_syndication;

    @SerializedName("media-metadata")
    @Expose
    private List<MediaMetaDataEmailed> mediaMetaDataEmailed;

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

    public boolean isApproved_for_syndication() {
        return approved_for_syndication;
    }

    public List<MediaMetaDataEmailed> getMediaMetaDataEmailed() {
        return mediaMetaDataEmailed;
    }
}
