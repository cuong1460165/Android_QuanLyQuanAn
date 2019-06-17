package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class bill_activity extends Activity {
    ArrayList<String> name = new ArrayList();
    ArrayList<Integer> tien = new ArrayList();
    ArrayList<Integer> solg = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        name.add("Goi bo");
        name.add("Uc vit sot ruou vang");
        name.add("Bo cau tiem bi do");

        solg.add(1);
        solg.add(1);
        solg.add(1);

        tien.add(10000);
        tien.add(20000);
        tien.add(10000);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_activity);
        GridView gridView = (GridView)findViewById(R.id.orderff);
        final GridviewAdapter_Order_Main gridViewAdapter = new GridviewAdapter_Order_Main(this, name, solg, tien);
        gridView.setAdapter(gridViewAdapter);
        Integer tongtien = 0;
        Integer i = 0;
        for (Integer item:tien) {
            tongtien = tongtien + solg.get(i) * item;
            i++;
        }
        TextView tt = (TextView)findViewById(R.id.tongtienff);
        tt.setText(tongtien.toString());

        Button ttoan = (Button)findViewById(R.id.thanhtoan);
        ttoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(bill_activity.this,"Thanh toán thành công",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(bill_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(bill_activity.this, bill_main_activity.class);
                startActivity(intent);
            }
        });
    }
}
