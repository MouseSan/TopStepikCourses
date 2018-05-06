package org.stepik.topstepikcourses;

import org.stepik.topstepikcourses.dto.CoursesPage;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StepikApi {

    @GET("api/courses")
    Call<CoursesPage> getCourses(@Query("page") int numberOfPage);

}
