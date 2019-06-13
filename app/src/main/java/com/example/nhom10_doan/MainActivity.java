package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
    String[] name = {"Danh mục", "Món ăn",
            "Lập menu", "Đặt bàn",
            "Doanh thu", "Order",
            "Tính tiền"};
    int[] image = {R.drawable.category, R.drawable.food,
            R.drawable.menu, R.drawable.table,
            R.drawable.revenue, R.drawable.order,
            R.drawable.bill};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.mainGV);
        GridViewAdapter_Main gridViewAdapter = new GridViewAdapter_Main(this, name, image);
        gridView.setAdapter(gridViewAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent intent = new Intent(MainActivity.this, food_activity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Lập Menu", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Đặt bàn", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Doanh thu", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "Order", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "Tính tiền", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;

                }
            }
        });
    }
}
