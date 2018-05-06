package org.stepik.topstepikcourses;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public enum SingletonEnumStepikApi {
    INSTANCE();

    SingletonEnumStepikApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://stepik.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        stepikApi = retrofit.create(StepikApi.class);
    }

    private final StepikApi stepikApi;

    public StepikApi getApi() {
        return stepikApi;
    }
}
