package org.stepik.topstepikcourses.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Meta {

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("has_next")
    @Expose
    private boolean hasNext;

    @SerializedName("has_previous")
    @Expose
    private boolean hasPrevious;

}
