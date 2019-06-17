package com.example.nhom10_doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridviewAdapter_Bill_Main extends BaseAdapter {
    private Context context;
    private ArrayList<String> name;
    private ArrayList<Integer> tien;

    public GridviewAdapter_Bill_Main(Context context, ArrayList<String> name, ArrayList<Integer> tien ) {
        this.context = context;
        this.name = name;
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
        convertView = layoutInflater.inflate(R.layout.gridview_bill_main_row,null);
        TextView textView = (TextView)convertView.findViewById(R.id.total);
        TextView textView2 = (TextView)convertView.findViewById(R.id.tablename);

        textView2.setText(name.get(position));
        textView.setText(tien.get(position).toString());
        return convertView;
    }

}
