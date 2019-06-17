package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class order_activity extends Activity {
    ArrayList<String> name = new ArrayList();
    ArrayList<String> dec = new ArrayList();
    ArrayList<Integer> image = new ArrayList();
    ArrayList<Integer> solg = new ArrayList();
    ArrayList<Integer> tien = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        name.add("Goi bo");
        name.add("Uc vit sot ruou vang");
        name.add("Bo cau tiem bi do");
        name.add("Ga nuong");
        name.add("Bo la lot");
        name.add("Heo toc quay lu chat met");
        name.add("Ca tam nuong muoi ot");
        name.add("Canh ga chien mat ong");
        name.add("Goi cuon tom thit");
        name.add("Ca chinh nuong muoi ot");

        dec.add("Goi bo");
        dec.add("Uc vit sot ruou vang");
        dec.add("Bo cau tiem bi do");
        dec.add("Ga nuong");
        dec.add("Bo la lot");
        dec.add("Heo toc quay lu chat met");
        dec.add("Ca tam nuong muoi ot");
        dec.add("Canh ga chien mat ong");
        dec.add("Goi cuon tom thit");
        dec.add("Ca chinh nuong muoi ot");

        image.add(R.drawable.h1);
        image.add(R.drawable.h2);
        image.add(R.drawable.h3);
        image.add(R.drawable.h4);
        image.add(R.drawable.h5);
        image.add(R.drawable.h6);
        image.add(R.drawable.h7);
        image.add(R.drawable.h8);
        image.add(R.drawable.h9);
        image.add(R.drawable.h10);

        solg.add(0);
        solg.add(0);
        solg.add(0);
        solg.add(0);
        solg.add(0);
        solg.add(0);
        solg.add(0);
        solg.add(0);
        solg.add(0);
        solg.add(0);

        tien.add(10000);
        tien.add(20000);
        tien.add(10000);
        tien.add(30000);
        tien.add(40000);
        tien.add(10000);
        tien.add(50000);
        tien.add(60000);
        tien.add(20000);
        tien.add(10000);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        final GridView gridView = (GridView) findViewById(R.id.orderGV);
        final GridviewAdapter_Order gridViewAdapter = new GridviewAdapter_Order(this, name, image, dec, solg);
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
        SearchView sv = (SearchView) findViewById(R.id.searchBar);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                ArrayList<String> name2 = new ArrayList();
                ArrayList<String> dec2 = new ArrayList();
                ArrayList<Integer> image2 = new ArrayList();
                ArrayList<Integer> solg2 = new ArrayList();

                Toast.makeText(order_activity.this,name.get(1),Toast.LENGTH_SHORT).show();
                if(query != "") {
                    int i = 0;
                    for (String item : name) {
                        if (item.toLowerCase().contains(query.toLowerCase())) {
                            name2.add(name.get(i));
                            dec2.add(dec.get(i));
                            image2.add(image.get(i));
                            solg2.add(image.get(i));
                            i++;
                        }
                    }
                    final GridviewAdapter_Order gridViewAdapter2 = new GridviewAdapter_Order(order_activity.this, name2, image2, dec2, solg2);
                    gridView.setAdapter(gridViewAdapter2);
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        Button btn = (Button) findViewById(R.id.datmonbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> solg3 = new ArrayList();
                GridviewAdapter_Order gridViewAdapter2 = (GridviewAdapter_Order) gridView.getAdapter();
                solg3 = gridViewAdapter2.getSolg();


                ArrayList<String> name2 = new ArrayList();
                ArrayList<Integer> solg2 = new ArrayList();
                ArrayList<Integer> tien2 = new ArrayList();
                int i = 0;
                boolean check = false;
                for (Integer item : solg3) {
                    if (item > 0) {
                        name2.add(name.get(i));
                        solg2.add(solg.get(i));
                        tien2.add(tien.get(i));
                        check = true;
                    }
                    i++;
                }
                if ( check == true) {
                    Toast.makeText(order_activity.this,"Bạn đã đặt món thành công",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(order_activity.this, order_main.class);
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("name", name2);
                    bundle.putIntegerArrayList("solg", solg2);
                    bundle.putIntegerArrayList("tien", tien2);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(order_activity.this,"Vui lòng chọn món",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(order_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
