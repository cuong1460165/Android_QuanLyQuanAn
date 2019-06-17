package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class booking_activity extends Activity {
    String[] name = {"Bàn 1","Bàn 2","Bàn 3","Bàn 4","Bàn 5",
            "Bàn 6","Bàn 7","Bàn 8","Bàn 9","Bàn 10",
            "Bàn 11","Bàn 12","Bàn 13","Bàn 14","Bàn 15",
            "Bàn 16","Bàn 17","Bàn 18","Bàn 19","Bàn 20",
            "Bàn 21","Bàn 22","Bàn 23","Bàn 24","Bàn 25",
            "Bàn 26","Bàn 27","Bàn 28"};
    int[] image = {R.drawable.table1, R.drawable.table2,R.drawable.table2, R.drawable.table2,R.drawable.table1,
            R.drawable.table2, R.drawable.table1,R.drawable.table1, R.drawable.table2,R.drawable.table1,
            R.drawable.table1, R.drawable.table2,R.drawable.table2, R.drawable.table1,R.drawable.table1,
            R.drawable.table2, R.drawable.table1,R.drawable.table2, R.drawable.table2,R.drawable.table1,
            R.drawable.table2, R.drawable.table2,R.drawable.table1, R.drawable.table1,R.drawable.table2,
            R.drawable.table1, R.drawable.table1,R.drawable.table2};
    int[] stt = {1, 2, 2, 2, 1,
            2, 1, 1, 2, 1,
            1, 2, 2, 1, 1,
            2, 1, 2, 2,1,
            2, 2, 1, 1,2,
            1, 1, 2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        GridView gridView = (GridView) findViewById(R.id.bookingGV);
        GridviewAdapter_Booking gridViewAdapter = new GridviewAdapter_Booking(this, name, image);
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (stt[position] == 1) {
                    Intent intent = new Intent(booking_activity.this, Booking_detail.class);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(booking_activity.this, Checkin.class);
                    startActivity(intent);
                }
            }
        });
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(booking_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
