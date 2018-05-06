package org.stepik.topstepikcourses.dto;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IntroVideo {

    @SerializedName("id")
    @Expose
    private Integer id;
    
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    
    @SerializedName("urls")
    @Expose
    private List<Url> urls = new ArrayList<Url>();
    
    @SerializedName("duration")
    @Expose
    private Integer duration;
    
    @SerializedName("status")
    @Expose
    private String status;
    
    @SerializedName("upload_date")
    @Expose
    private String uploadDate;
    
    @SerializedName("filename")
    @Expose
    private String filename;

}