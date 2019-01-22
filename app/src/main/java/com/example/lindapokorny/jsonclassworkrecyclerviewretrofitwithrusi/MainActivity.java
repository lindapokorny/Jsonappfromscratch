package com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi;


/* add dependencies to the Android Module: app:
    implementation 'com.squareup.retrofit2:retrofit:2.5.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    implementation 'com.squareup.picasso:picasso:2.71828'
    implementation 'com.android.support:recyclerview-v7:28.0.0'
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.controller.MyAndroidAdapter;
import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.model.AndroidList;
import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.network.AndroidService;
import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    //  we added a permission in our Manifest in oder to access Retrofit
    private static final String TAG = "List";
    RecyclerView recyclerView;

    //you usually want your callback to be done in your main activity because .. (ask)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = RetrofitSingleton.getInstance();
        recyclerView = findViewById(R.id.recycler_view);

        Call<AndroidList> call = retrofit.create(AndroidService.class).getAndroid();
        Log.d(TAG, "Request: " + call.request());
        call.enqueue(new Callback<AndroidList>() {
                    @Override
                    public void onResponse(Call<AndroidList> call, Response<AndroidList> response) {
                        recyclerView.setAdapter(new MyAndroidAdapter(response.body().getAndroidList()));
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

                        Log.d(TAG, "OnResponse" + response.body().getAndroidList().get(0).getName());
                    }

                    @Override
                    public void onFailure(Call<AndroidList> call, Throwable t) {
                        Log.d(TAG, "OnFailure" + t.getMessage());
                    }
                });

    }
}
/*
This code will be pretty much identical when you are doing a retrofit call.
Retrofit retrofit = RetrofitSingleton.getInstance();

        retrofit.create(AndroidService.class)
                .getAndroid()
                .enqueue(new Callback<AndroidList>() {
                    @Override
                    public void onResponse(Call<AndroidList> call, Response<AndroidList> response) {
                        Log.d(TAG, "OnResponse" + response.body().getAndroidList().get(0).getName());
                    }

                    @Override
                    public void onFailure(Call<AndroidList> call, Throwable t) {
                        Log.d(TAG, "OnFailure" + t.getMessage());
                    }
                });
*/