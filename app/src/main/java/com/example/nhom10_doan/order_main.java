package com.example.nhom10_doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class order_main extends AppCompatActivity {
    ArrayList<String> name = new ArrayList();
    ArrayList<Integer> solg = new ArrayList();
    ArrayList<Integer> tien = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            name = bundle.getStringArrayList("name");
            solg = bundle.getIntegerArrayList("solg");
            tien = bundle.getIntegerArrayList("tien");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_main);
        final GridView gridView = (GridView) findViewById(R.id.orderf);
        final GridviewAdapter_Order_Main gridViewAdapter = new GridviewAdapter_Order_Main(this, name, solg, tien);
        gridView.setAdapter(gridViewAdapter);
        Integer tongtien = 0;
        Integer i = 0;
        for (Integer item:tien) {
            tongtien = tongtien + solg.get(i) * item;
            i++;
        }
        TextView tt = (TextView)findViewById(R.id.tongtien);
        tt.setText(tongtien.toString());
        Button ht = (Button)findViewById(R.id.hoanthanh);
        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(order_main.this, MainActivity.class);
                startActivity(intent1);

            }
        });
    }


}
