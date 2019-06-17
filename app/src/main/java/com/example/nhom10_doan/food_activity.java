package com.example.nhom10_doan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class food_activity extends AppCompatActivity {
    ArrayList<String> name = new ArrayList();
    ArrayList<String> dec = new ArrayList();
    ArrayList<Integer> image = new ArrayList();

    GridView gridView;
    SearchView searchFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        mapping();
        initData();


        GridViewAdapter_Food gridViewAdapter = new GridViewAdapter_Food(this, name, image, dec);
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(food_activity.this, dec.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        searchFood.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<String> name2 = new ArrayList();
                ArrayList<String> dec2 = new ArrayList();
                ArrayList<Integer> image2 = new ArrayList();
                if(newText != "") {
                    int i = 0;
                    for (String item : name) {
                        if (item.toLowerCase().contains(newText.toLowerCase())) {
                            name2.add(name.get(i));
                            dec2.add(dec.get(i));
                            image2.add(image.get(i));
                            i++;
                        }
                    }
                    GridViewAdapter_Food gridViewAdapter2 = new GridViewAdapter_Food(food_activity.this, name2, image2, dec2);
                    gridView.setAdapter(gridViewAdapter2);
                }
                return false;
            }
        });
    }

    private void initData() {
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
    }

    private void mapping() {
        gridView = (GridView) findViewById(R.id.foodGV);
        searchFood = (SearchView) findViewById(R.id.searchFood);
    }
}
