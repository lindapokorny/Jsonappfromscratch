package com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {

        private static Retrofit instance;

        private RetrofitSingleton(){}
        public static Retrofit getInstance() {
            if (instance != null) {
                return instance;
            }
            instance = new Retrofit.Builder()
                    .baseUrl("https://api.learn2crack.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        return instance;
    }
}
