package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class doanhthu extends Activity{
    private PieChart pieChart;
    private PieChart pieChart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doanhthu);

        int totalorder = 50;
        int totalm = 500000;
        TextView solgorder = (TextView) findViewById(R.id.solgorder);
        solgorder.setText(String.valueOf(totalorder) + "Đơn");
        TextView totalmoney = (TextView) findViewById(R.id.totalmoney);
        totalmoney.setText(String.valueOf(totalm) + " Đồng");

        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setRotationEnabled(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5, 10, 5, 5);

        pieChart.setDragDecelerationFrictionCoef(0.95f);

        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry(70f,"Chi phí"));
        yValues.add(new PieEntry(30f,"Lợi nhuận"));

        PieDataSet dataSet = new PieDataSet(yValues, "Tỉ lệ doanh thu");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data = new PieData((dataSet));
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);

        pieChart.setData(data);

        pieChart2 = (PieChart) findViewById(R.id.piechart2);
        pieChart2.setRotationEnabled(true);
        pieChart2.getDescription().setEnabled(false);
        pieChart2.setExtraOffsets(5, 10, 5, 5);

        pieChart2.setDragDecelerationFrictionCoef(0.95f);

        pieChart2.setDrawHoleEnabled(true);
        pieChart2.setHoleColor(Color.WHITE);
        pieChart2.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues2 = new ArrayList<>();

        yValues2.add(new PieEntry(90f,"Thành công"));
        yValues2.add(new PieEntry(10f,"Từ chối"));

        PieDataSet dataSet2 = new PieDataSet(yValues2, "Tỉ lệ order thành công");
        dataSet2.setSliceSpace(3f);
        dataSet2.setSelectionShift(5f);
        dataSet2.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data2 = new PieData((dataSet2));
        data2.setValueTextSize(10f);
        data2.setValueTextColor(Color.YELLOW);

        pieChart2.setData(data2);
        ImageView img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(doanhthu.this, MainActivity.class);
                startActivity(intent);
            }
        });
   }
}