package com.example.myapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/v1/current.json")
    Call<List<weatherModel>>getWeather();
    @GET("/v1/forecast.json")
}
