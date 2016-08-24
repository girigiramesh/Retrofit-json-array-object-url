package com.retrofit_json_array_object_url;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Ramesh on 8/24/16.
 */
public interface RetrofitObjectAPI {
    /*
    * Retrofit get annotation with our URL
    * And our method that will return us details of student.
   */
    @GET("api/RetrofitAndroidObjectResponse")
    Call<Student> getStudentDetails();
}
