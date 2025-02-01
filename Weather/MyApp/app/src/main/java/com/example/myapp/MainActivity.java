package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static String api1 = "http://api.weatherapi.com";
    public static String api2 = "http://api.weatherapi.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RetrofitInstance.getInstance().apiInterface.getWeather().enqueue(new Callback<List<weatherModel>>() {
            @Override
            public void onResponse(Call<List<weatherModel>> call, Response<List<weatherModel>> response) {
                Log.e("api1", "OnResponse"+response.body().toString());
            }

            @Override
            public void onFailure(Call<List<weatherModel>> call, Throwable t) {
                Log.e("api1", "OnFailure"+t.getLocalizedMessage());
            }
        });

    }
}