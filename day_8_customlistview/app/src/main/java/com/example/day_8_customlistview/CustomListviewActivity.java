package com.example.day_8_customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class CustomListviewActivity extends AppCompatActivity {
    GridView gv1;
    int[]image = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    String []name = {"This is flutter","This is Swift","This is SwiftUI"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);

        gv1 = findViewById(R.id.gv1);
        MyAdapter myAdapter = new MyAdapter(CustomListviewActivity.this, image, name);
        gv1.setAdapter(myAdapter);
        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(CustomListviewActivity.this, ListviewDetailActivity.class);
                intent.putExtra("image", image[position]);
                intent.putExtra("name", name[position]);
                startActivity(intent);
            }
        });
    }
}