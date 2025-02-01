package com.example.myapp;

import static com.example.myapp.MainActivity.api1;
import static com.example.myapp.MainActivity.api2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static RetrofitInstance instance;
    ApiInterface apiInterface;

     RetrofitInstance(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api1)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);

        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl(api2)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit2.create(ApiInterface.class);
    }

    public static RetrofitInstance getInstance(){
        if (instance == null){
            instance = new RetrofitInstance();
        }
        return instance;
    }
}
