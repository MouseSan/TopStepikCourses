package org.stepik.topstepikcourses.dto;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CoursesPage {

    @SerializedName("meta")
    @Expose
    private Meta meta;

    @SerializedName("courses")
    @Expose
    private List<Course> courses = new ArrayList<>();

    @SerializedName("enrollments")
    @Expose
    private List<Object> enrollments;

}
