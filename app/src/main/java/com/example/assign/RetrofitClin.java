package com.example.assign;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClin {

    private static RetrofitClin instance = null;
    private Apii myApi;

    private RetrofitClin() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Apii.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(Apii.class);
    }

    public static synchronized RetrofitClin getInstance() {
        if (instance == null) {
            instance = new RetrofitClin();
        }
        return instance;
    }

    public Apii getMyApi() {
        return myApi;
    }
}
