package com.example.andronews2.viewed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaMetaData {

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("format")
    @Expose
    private String format;

    @SerializedName("height")
    @Expose
    private int height;

    @SerializedName("width")
    @Expose
    private int width;

    public String getUrl() {
        return url;
    }

    public String getFormat() {
        return format;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
