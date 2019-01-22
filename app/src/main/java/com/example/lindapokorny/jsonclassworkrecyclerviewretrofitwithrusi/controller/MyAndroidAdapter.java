package com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.R;
import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.model.MyAndroid;

import java.util.List;

public class MyAndroidAdapter extends RecyclerView.Adapter<MyAndroidViewHolder> {
    private List<MyAndroid> androidList;

    public MyAndroidAdapter(List<MyAndroid> androidList){
        this.androidList = androidList;
    }

    @NonNull
    @Override
    public MyAndroidViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_android_itemview, viewGroup, false);
        return new MyAndroidViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAndroidViewHolder myAndroidViewHolder, int i) {
        myAndroidViewHolder.onBind(androidList.get(i));
    }

    @Override
    public int getItemCount() {
        return androidList.size();
    }

}
