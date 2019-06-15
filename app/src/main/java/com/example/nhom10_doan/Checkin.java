package com.example.nhom10_doan;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Checkin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        TextView tenKhach = (TextView) findViewById(R.id.idTenKhach);
        tenKhach.setText("Nguyen Van Tuan");
        TextView soKhach = (TextView) findViewById(R.id.idSoKhach);
        soKhach.setText("3");
        TextView ngayDat = (TextView) findViewById(R.id.idNgayDat);
        ngayDat.setText("2019/06/19");
        TextView gioDat = (TextView) findViewById(R.id.idGioDat);
        gioDat.setText("14");
    }
}
