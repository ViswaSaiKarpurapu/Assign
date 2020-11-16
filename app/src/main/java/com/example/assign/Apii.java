package com.example.assign;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface Apii {

        static String BASE_URL =  "http://www.weatherapi.com/docs/";
        @GET("weather_conditions.json")
        Call<List<Weather>> getWeather();


}
