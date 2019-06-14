package com.example.nhom10_doan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class booking_activity extends Activity {
    String[] name = {"Bàn 1","Bàn 2","Bàn 3","Bàn 4","Bàn 5",
            "Bàn 6","Bàn 7","Bàn 8","Bàn 9","Bàn 10",
            "Bàn 11","Bàn 12","Bàn 13","Bàn 14","Bàn 15",
            "Bàn 16","Bàn 17","Bàn 18","Bàn 19","Bàn 20",
            "Bàn 21","Bàn 22","Bàn 23","Bàn 24","Bàn 25",
            "Bàn 26","Bàn 27","Bàn 28"};
    int[] image = {R.drawable.table1, R.drawable.table2, R.drawable.table2, R.drawable.table2, R.drawable.table1,
            R.drawable.table2, R.drawable.table1, R.drawable.table1, R.drawable.table2, R.drawable.table1,
            R.drawable.table1, R.drawable.table2, R.drawable.table2, R.drawable.table1, R.drawable.table1,
            R.drawable.table2, R.drawable.table1, R.drawable.table2, R.drawable.table2, R.drawable.table1,
            R.drawable.table2, R.drawable.table2, R.drawable.table1, R.drawable.table1, R.drawable.table2,
            R.drawable.table1, R.drawable.table1, R.drawable.table2};
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
    }
}
