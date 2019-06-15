package com.example.nhom10_doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridviewAdapter_Order_Main extends BaseAdapter {
    private Context context;
    private ArrayList<String> name;
    private ArrayList<Integer> solg;
    private ArrayList<Integer> tien;

    public GridviewAdapter_Order_Main(Context context, ArrayList<String> name, ArrayList<Integer> solg, ArrayList<Integer> tien ) {
        this.context = context;
        this.name = name;
        this.solg = solg;
        this.tien = tien;
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.gridview_order_main_row,null);
        TextView textView = (TextView)convertView.findViewById(R.id.namefood);
        TextView textView2 = (TextView)convertView.findViewById(R.id.soluong);
        TextView textView3 = (TextView)convertView.findViewById(R.id.tien);

        textView.setText(name.get(position));
        textView2.setText(solg.get(position).toString());
        textView3.setText(tien.get(position).toString());

        return convertView;
    }

    public ArrayList<Integer> getSolg()
    {
        return this.solg;
    }
}
