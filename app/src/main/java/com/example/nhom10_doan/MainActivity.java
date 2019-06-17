package com.example.nhom10_doan;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
    public void onBackPressed() {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        Intent intent = new Intent(MainActivity.this, login_activity.class);
                        startActivity(intent);
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Bạn có muốn thoát chương trình?").setPositiveButton("Có", dialogClickListener)
                .setNegativeButton("Không", dialogClickListener).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.mainGV);
        GridViewAdapter_Main gridViewAdapter = new GridViewAdapter_Main(this,name,image);
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(MainActivity.this, danhmuc.class);
                        startActivity(intent0);
                        break;
                    case 1:

                        Intent intent1 = new Intent(MainActivity.this, food_activity.class);
                        startActivity(intent1);
                        break;
                    case 2:

                        Intent intent2 = new Intent(MainActivity.this, menu.class);
                        startActivity(intent2);
                        break;
                    case 3:

                        Intent intent3 = new Intent(MainActivity.this, booking_activity.class);
                        startActivity(intent3);
                        break;
                    case 4:

                        Intent intent4 = new Intent(MainActivity.this, doanhthu.class);
                        startActivity(intent4);
                        break;
                    case 5:

                        Intent intent5 = new Intent(MainActivity.this, order_activity.class);
                        startActivity(intent5);
                        break;
                    case 6:

                        Intent intent6 = new Intent(MainActivity.this, bill_main_activity.class);
                        startActivity(intent6);
                        break;

                }
            }
        });
    }
}
