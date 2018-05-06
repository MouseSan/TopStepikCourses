package org.stepik.topstepikcourses.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url {

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("quality")
    @Expose
    private String quality;

}