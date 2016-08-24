package com.retrofit_json_array_object_url;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Ramesh on 8/24/16.
 */
public interface RetrofitArrayAPI {
    /*
    * Retrofit get annotation with our URL
    * And our method that will return us details of student.
   */
    @GET("api/RetrofitAndroidArrayResponse")
    Call<List<Student>> getStudentDetails();
}
