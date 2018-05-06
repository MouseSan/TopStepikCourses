package org.stepik.topstepikcourses;

import org.stepik.topstepikcourses.dto.Course;
import org.stepik.topstepikcourses.dto.CoursesPage;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StepikCourseStatistic {

    private final StepikApi stepikApi = SingletonEnumStepikApi.INSTANCE.getApi();

    public void printTopCourses(int numberOfTopCourses) {
        List<Course> courseList = getCourseListFromStepik();

        courseList.sort(Course.Comparators.LEARNERS_COUNT);

        if (numberOfTopCourses > courseList.size()) {
            numberOfTopCourses = courseList.size();
        }

        for (int coursePlace = 1; coursePlace <= numberOfTopCourses; coursePlace++) {
            System.out.println("Place #" + coursePlace);
            System.out.println("Course title: " + courseList.get(coursePlace - 1).getTitle());
            System.out.println("Number of students: " + courseList.get(coursePlace - 1).getLearnersCount());
            System.out.println("------------------------------------");
        }
    }

    private List<Course> getCourseListFromStepik() {
        List<Course> courseList = new ArrayList<>();

        System.out.println("Start getting data from Stepik");

        for (int pageNumber = 1; ; pageNumber++) {
            CoursesPage coursesPages = getCoursesPagesResponse(pageNumber);

            if (coursesPages != null) {
                courseList.addAll(coursesPages.getCourses());

                if (coursesPages.getMeta() == null || !coursesPages.getMeta().isHasNext()) {
                    break;
                }
            } else {
                break;
            }
        }

        System.out.println("Number of courses processed: " + courseList.size());
        System.out.println("------------------------------------");
        return courseList;
    }

    private CoursesPage getCoursesPagesResponse(int pageNumber) {
        CoursesPage coursesPage = null;
        try {
            Response<CoursesPage> response = stepikApi.getCourses(pageNumber).execute();
            coursesPage = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return coursesPage;
    }

}
