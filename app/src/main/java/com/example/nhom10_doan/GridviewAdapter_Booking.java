package com.example.nhom10_doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewAdapter_Booking extends BaseAdapter {
    private Context context;
    private String[] name;
    private int[] image;

    public GridviewAdapter_Booking(Context context, String[] name, int[] image) {
        this.context = context;
        this.name = name;
        this.image = image;
    }

    @Override
    public int getCount() {
        return name.length;
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
        convertView = layoutInflater.inflate(R.layout.gridview_booking_row,null);
        TextView textView = (TextView)convertView.findViewById(R.id.textBookingView);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageBookingView);

        textView.setText(name[position]);
        imageView.setImageResource(image[position]);
        return convertView;
    }
}
