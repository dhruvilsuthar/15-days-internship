package com.example.day_8_customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListviewDetailActivity extends AppCompatActivity {
    ImageView ivimage;
    TextView tvnamedetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_detail);

        tvnamedetails= findViewById(R.id.tvnamedetail);
        ivimage= findViewById(R.id.ivimage);
        Intent intent = getIntent();
        int image = intent.getIntExtra("image", R.drawable.image1);
        ivimage.setImageResource(image);
        String name = intent.getStringExtra("name");
        tvnamedetails.setText(name);

    }
}