package com.example.bs151.retrofitdemo;

import com.example.bs151.retrofitdemo.Pojo.Example;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by BS151 on 7/19/2016.
 */
public interface GetWeatherApi {
    @GET("/data/2.5/weather")
    void getWeatherFromApi(Callback<Example> callback);

}
