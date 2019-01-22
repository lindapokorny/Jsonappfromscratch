package com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.network;

import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.model.AndroidList;
import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.model.MyAndroid;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface AndroidService {
    @GET("android/jsonandroid/")
    Call<AndroidList> getAndroid();
}
