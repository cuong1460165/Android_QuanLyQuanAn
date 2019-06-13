package com.example.nhom10_doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridviewAdapter_Order extends BaseAdapter {
    private Context context;
    private ArrayList<String> name;
    private ArrayList<Integer> image;
    private ArrayList<String> dec;
    private ArrayList<Integer> solg;
    public GridviewAdapter_Order(Context context, ArrayList<String> name, ArrayList<Integer> image, ArrayList<String> dec,ArrayList<Integer> solg ) {
        this.context = context;
        this.name = name;
        this.image = image;
        this.dec = dec;
        this.solg = solg;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.gridview_order_row,null);
        TextView textView = (TextView)convertView.findViewById(R.id.foodNameView1);
        TextView textView2 = (TextView)convertView.findViewById(R.id.fooddecView1);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageFoodView1);
        final EditText editText = (EditText)convertView.findViewById(R.id.solg);
        textView.setText(name.get(position));
        textView2.setText(dec.get(position));
        imageView.setImageResource(image.get(position));
        editText.setText(solg.get(position).toString());
        Button btn = (Button)convertView.findViewById(R.id.plus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer i = Integer.parseInt(editText.getText().toString());
                i++;
                solg.set(position,i);
                editText.setText(i.toString());
            }
        });
        Button btn1 = (Button)convertView.findViewById(R.id.tru);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer i = Integer.parseInt(editText.getText().toString());
                if ( i> 0) {
                    i--;
                    solg.set(position,i);
                    editText.setText(i.toString());
                }
            }
        });
        return convertView;
    }

    public ArrayList<Integer> getSolg()
    {
        return this.solg;
    }
}
