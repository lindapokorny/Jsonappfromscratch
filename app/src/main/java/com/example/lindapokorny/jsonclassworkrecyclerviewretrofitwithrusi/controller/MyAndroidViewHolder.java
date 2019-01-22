package com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.controller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.R;
import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.SecondActivity;
import com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi.model.MyAndroid;

class MyAndroidViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "image_call";
    private SharedPreferences sharedPreferences;
    private TextView nameTextView;
    private TextView verTextView;
    private TextView apiTextView;
    private Intent intent;

    public MyAndroidViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name_text_view);
        verTextView = itemView.findViewById(R.id.ver_text_view);
        apiTextView = itemView.findViewById(R.id.api_text_view);
        //sharedPreferences = itemView.getContext().getApplicationContext().getSharedPreferences(TAG, Context.MODE_PRIVATE);
    }
/*

 */
    public void onBind(final MyAndroid androids) {

        nameTextView.setText(androids.getName());
        verTextView.setText(androids.getVer());
        apiTextView.setText(androids.getApi());
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(itemView.getContext(), SecondActivity.class);
                intent.putExtra("name", androids.getName());
                intent.putExtra("version", androids.getVer());
                intent.putExtra("api", androids.getApi());
                v.getContext().startActivity(intent);

            }

        });
    }
}