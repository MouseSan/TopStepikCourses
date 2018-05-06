package org.stepik.topstepikcourses.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
public class Course implements Comparable<Course> {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("workload")
    @Expose
    private String workload;

    @SerializedName("cover")
    @Expose
    private String cover;

    @SerializedName("intro")
    @Expose
    private String intro;

    @SerializedName("course_format")
    @Expose
    private String courseFormat;

    @SerializedName("target_audience")
    @Expose
    private String targetAudience;

    @SerializedName("certificate_footer")
    @Expose
    private Object certificateFooter;

    @SerializedName("certificate_cover_org")
    @Expose
    private Object certificateCoverOrg;

    @SerializedName("is_certificate_auto_issued")
    @Expose
    private Boolean isCertificateAutoIssued;

    @SerializedName("certificate_regular_threshold")
    @Expose
    private Integer certificateRegularThreshold;

    @SerializedName("certificate_distinction_threshold")
    @Expose
    private Integer certificateDistinctionThreshold;

    @SerializedName("instructors")
    @Expose
    private List<Integer> instructors = new ArrayList<Integer>();

    @SerializedName("certificate")
    @Expose
    private String certificate;

    @SerializedName("requirements")
    @Expose
    private String requirements;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("sections")
    @Expose
    private List<Integer> sections = new ArrayList<Integer>();

    @SerializedName("total_units")
    @Expose
    private Integer totalUnits;

    @SerializedName("enrollment")
    @Expose
    private Object enrollment;

    @SerializedName("is_favorite")
    @Expose
    private Boolean isFavorite;

    @SerializedName("actions")
    @Expose
    private Actions actions;

    @SerializedName("progress")
    @Expose
    private Object progress;

    @SerializedName("first_lesson")
    @Expose
    private Integer firstLesson;

    @SerializedName("first_unit")
    @Expose
    private Integer firstUnit;

    @SerializedName("certificate_link")
    @Expose
    private Object certificateLink;

    @SerializedName("certificate_regular_link")
    @Expose
    private Object certificateRegularLink;

    @SerializedName("certificate_distinction_link")
    @Expose
    private Object certificateDistinctionLink;

    @SerializedName("schedule_link")
    @Expose
    private Object scheduleLink;

    @SerializedName("schedule_long_link")
    @Expose
    private Object scheduleLongLink;

    @SerializedName("first_deadline")
    @Expose
    private Object firstDeadline;

    @SerializedName("last_deadline")
    @Expose
    private Object lastDeadline;

    @SerializedName("subscriptions")
    @Expose
    private List<String> subscriptions = new ArrayList<String>();

    @SerializedName("announcements")
    @Expose
    private List<Object> announcements = new ArrayList<Object>();

    @SerializedName("is_contest")
    @Expose
    private Boolean isContest;

    @SerializedName("is_self_paced")
    @Expose
    private Boolean isSelfPaced;

    @SerializedName("is_adaptive")
    @Expose
    private Boolean isAdaptive;

    @SerializedName("is_idea_compatible")
    @Expose
    private Boolean isIdeaCompatible;

    @SerializedName("last_step")
    @Expose
    private String lastStep;

    @SerializedName("intro_video")
    @Expose
    private IntroVideo introVideo;

    @SerializedName("social_providers")
    @Expose
    private List<Object> socialProviders = new ArrayList<Object>();

    @SerializedName("authors")
    @Expose
    private List<Integer> authors = new ArrayList<Integer>();

    @SerializedName("tags")
    @Expose
    private List<Integer> tags = new ArrayList<Integer>();

    @SerializedName("has_tutors")
    @Expose
    private Boolean hasTutors;

    @SerializedName("is_promoted")
    @Expose
    private Boolean isPromoted;

    @SerializedName("is_enabled")
    @Expose
    private Boolean isEnabled;

    @SerializedName("is_proctored")
    @Expose
    private Boolean isProctored;

    @SerializedName("proctor_url")
    @Expose
    private Object proctorUrl;

    @SerializedName("review_summary")
    @Expose
    private Integer reviewSummary;

    @SerializedName("schedule_type")
    @Expose
    private String scheduleType;

    @SerializedName("certificates_count")
    @Expose
    private Integer certificatesCount;

    @SerializedName("learners_count")
    @Expose
    private Integer learnersCount;

    @SerializedName("time_to_complete")
    @Expose
    private Integer timeToComplete;

    @SerializedName("is_popular")
    @Expose
    private Boolean isPopular;

    @SerializedName("similar_courses")
    @Expose
    private List<Integer> similarCourses = new ArrayList<Integer>();

    @SerializedName("is_unsuitable")
    @Expose
    private Boolean isUnsuitable;

    @SerializedName("owner")
    @Expose
    private Integer owner;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("is_featured")
    @Expose
    private Boolean isFeatured;

    @SerializedName("is_private")
    @Expose
    private Boolean isprivate;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("slug")
    @Expose
    private String slug;

    @SerializedName("begin_date")
    @Expose
    private Object beginDate;

    @SerializedName("end_date")
    @Expose
    private Object endDate;

    @SerializedName("soft_deadline")
    @Expose
    private Object softDeadline;

    @SerializedName("hard_deadline")
    @Expose
    private Object hardDeadline;

    @SerializedName("grading_policy")
    @Expose
    private String gradingPolicy;

    @SerializedName("begin_date_source")
    @Expose
    private Object beginDateSource;

    @SerializedName("end_date_source")
    @Expose
    private Object endDateSource;

    @SerializedName("soft_deadline_source")
    @Expose
    private Object softDeadlineSource;

    @SerializedName("hard_deadline_source")
    @Expose
    private Object hardDeadlineSource;

    @SerializedName("grading_policy_source")
    @Expose
    private String gradingPolicySource;

    @SerializedName("is_active")
    @Expose
    private Boolean isActive;

    @SerializedName("create_date")
    @Expose
    private String createDate;

    @SerializedName("update_date")
    @Expose
    private String updateDate;

    @SerializedName("learners_group")
    @Expose
    private Object learnersGroup;

    @SerializedName("testers_group")
    @Expose
    private Object testersGroup;

    @SerializedName("moderators_group")
    @Expose
    private Object moderatorsGroup;

    @SerializedName("teachers_group")
    @Expose
    private Object teachersGroup;

    @SerializedName("admins_group")
    @Expose
    private Object adminsGroup;

    @SerializedName("discussions_count")
    @Expose
    private Integer discussionsCount;

    @SerializedName("discussion_proxy")
    @Expose
    private Object discussionProxy;

    @SerializedName("discussion_threads")
    @Expose
    private List<Object> discussionThreads = new ArrayList<Object>();

    @SerializedName("lti_consumer_key")
    @Expose
    private String ltiConsumerKey;

    @SerializedName("lti_secret_key")
    @Expose
    private String ltiSecretKey;

    @Override
    public int compareTo(Course o) {
        return Comparators.LEARNERS_COUNT.compare(this, o);
    }

    public static class Comparators {
        public static Comparator<Course> LEARNERS_COUNT = (o1, o2) -> o2.learnersCount - o1.learnersCount;
    }

}
