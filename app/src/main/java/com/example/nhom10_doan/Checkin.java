package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        Button btnback = (Button) findViewById(R.id.btnQuayLai);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Checkin.this, booking_activity.class);
                startActivity(intent);
            }
        });
        Button btnxn = (Button) findViewById(R.id.btnCheckin);
        btnxn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Checkin.this,"Bạn đã check in thành công",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Checkin.this, booking_activity.class);
                startActivity(intent);
            }
        });
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Checkin.this, booking_activity.class);
                startActivity(intent);
            }
        });
    }
}
