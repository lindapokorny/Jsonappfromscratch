package com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView verTextView;
    private TextView apiTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameTextView = findViewById(R.id.second_name_text_view);

        Intent intent = getIntent();
        nameTextView.setText(intent.getStringExtra("name") +
                (intent.getStringExtra("api")) +
                intent.getStringExtra("version"));


    }

}
