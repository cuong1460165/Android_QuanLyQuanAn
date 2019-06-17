package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class danhmuc extends Activity {
    String [] name = {"Món ăn", "Giải khát"};
    int [] image = {R.drawable.food2, R.drawable.drink};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmuc);
        GridView gridView = (GridView)findViewById(R.id.ddmGV);
        GridViewAdapter_Main gridViewAdapter = new GridViewAdapter_Main(this,name,image);
        gridView.setAdapter(gridViewAdapter);
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(danhmuc.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
