package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class bill_main_activity extends Activity {
    ArrayList<String> name = new ArrayList();
    ArrayList<Integer> tien = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        name.add("Ban1");
        name.add("Ban2");
        name.add("Ban3");

        tien.add(30000);
        tien.add(20000);
        tien.add(40000);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_main_activity);

        final GridView gridView = (GridView) findViewById(R.id.orderf);
        GridviewAdapter_Bill_Main gridViewAdapter = new GridviewAdapter_Bill_Main(this, name, tien);
        gridView.setAdapter(gridViewAdapter);

    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(bill_main_activity.this, bill_activity.class);
            startActivity(intent);
        }
    });
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(bill_main_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
