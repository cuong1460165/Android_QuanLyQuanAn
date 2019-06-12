package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
    String [] name = {"Danh mục", "Món ăn",
            "Lập menu", "Đặt bàn",
            "Doanh thu", "Order",
            "Tính tiền"};
    int [] image = {R.drawable.category, R.drawable.food,
            R.drawable.menu,R.drawable.table,
            R.drawable.revenue,R.drawable.order,
            R.drawable.bill};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.mainGV);
        GridViewAdapter_Main gridViewAdapter = new GridViewAdapter_Main(this,name,image);
        gridView.setAdapter(gridViewAdapter);
    }
}
