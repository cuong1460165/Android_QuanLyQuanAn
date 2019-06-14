package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Booking_detail extends Activity {
    ArrayList<String> soKhach = new ArrayList();
    ArrayList<String> thoiGian = new ArrayList();
    ArrayList<String> ngayDat = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        soKhach.add("1");
        soKhach.add("2");
        soKhach.add("3");
        soKhach.add("4");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_detail);
        Spinner spnSoKhach = (Spinner) findViewById(R.id.spnSoKhach);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        soKhach
                );
        adapter.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spnSoKhach.setAdapter(adapter);
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
        Calendar calendar = Calendar.getInstance();
        calendar.add(calendar.DATE,1);
        ngayDat.add(mdformat.format(calendar.getTime()));
        calendar.add(calendar.DATE,1);
        ngayDat.add(mdformat.format(calendar.getTime()));
        calendar.add(calendar.DATE,1);
        ngayDat.add(mdformat.format(calendar.getTime()));
        Spinner spnNgayDat = (Spinner) findViewById(R.id.spnNgaydat);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        ngayDat
                );
        adapter2.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spnNgayDat.setAdapter(adapter2);
        for (Integer i = 8; i< 23;i++)
        {
            thoiGian.add(Integer.toString(i));
        }
        Spinner spnThoiGian = (Spinner) findViewById(R.id.spnThoiGian);
        ArrayAdapter<String> adapter1 =new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        thoiGian
                );
        adapter1.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spnThoiGian.setAdapter(adapter1);
        Button btnback = (Button) findViewById(R.id.btnQuayLai);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Booking_detail.this, booking_activity.class);
                startActivity(intent);
            }
        });
    }
}
