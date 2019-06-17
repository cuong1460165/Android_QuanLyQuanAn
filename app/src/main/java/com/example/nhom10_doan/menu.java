package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class menu extends Activity {
    ArrayList<String> name = new ArrayList();
    ArrayList<String> dec = new ArrayList();
    ArrayList<Integer> image = new ArrayList();

    ArrayList<String> name2 = new ArrayList();
    ArrayList<String> dec2 = new ArrayList();
    ArrayList<Integer> image2 = new ArrayList();

    ArrayList<Integer> random = new ArrayList();
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

        random = getRandomElementInteger(8);

        for (int i=0;i<8;i++)
        {
            name2.add(name.get(i));
            image2.add(image.get(i));
            dec2.add(dec.get(i));
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final GridView gridView = (GridView) findViewById(R.id.menuGV);
        GridViewAdapter_Food gridViewAdapter = new GridViewAdapter_Food(this, name2, image2, dec2);
        gridView.setAdapter(gridViewAdapter);

        Button btnxn = (Button) findViewById(R.id.xacnhan);
        btnxn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(menu.this,"Lập menu thành công",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(menu.this, food_activity.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("name", name2);
                bundle.putIntegerArrayList("image", image2);
                bundle.putStringArrayList("dec", dec2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        Button btrandom = (Button) findViewById(R.id.lapmenu);
        btrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    name2.clear();
                    image2.clear();
                    dec2.clear();
                random = getRandomElementInteger(8);

                for (int i=0;i<8;i++)
                {
                    name2.add(name.get(random.get(i)));
                    image2.add(image.get(random.get(i)));
                    dec2.add(dec.get(random.get(i)));
                }
                GridViewAdapter_Food gridViewAdapter2 = new GridViewAdapter_Food(menu.this, name2, image2, dec2);
                gridView.setAdapter(gridViewAdapter2);

            }
        });
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public ArrayList<Integer> getRandomElementInteger(int totalItems)
    {
        int newitem = 0;
        int check = 1;
        Random rand = new Random();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {
            newitem = rand.nextInt(10);
            check = 0;
            while(true) {
                check = 0;
                for (int j = 0; j < newList.size(); j++) {
                    if (newitem == newList.get(j)) {
                        newitem = rand.nextInt(10);
                        check = 1;
                    }
                }
                if (check == 0)
                {
                    break;
                }
            }
            newList.add(newitem);
        }
        return newList;
    }
}
