package com.example.superselector;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] names;
    private final Integer[] ages;
    private final Integer[] height;
    private final String[] nation;
    private final Integer[] imgs;
    private final boolean[] bool;

    public MyListAdapter(Activity context, String[] name, Integer[] ages, Integer[] height, String[] nation, Integer[] img, boolean []b) {
        super(context, R.layout.items, name);
        this.bool=b;
        this.context=context;
        this.names=name;
        this.ages=ages;
        this.height = height;
        this.nation = nation;
        this.imgs=img;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.items, null,true);

        TextView titleText = rowView.findViewById(R.id.text);
        ImageView imageView = rowView.findViewById(R.id.image);
        TextView subtitleText = rowView.findViewById(R.id.text2);

        titleText.setText(names[position]);
        imageView.setImageResource(imgs[position]);
        subtitleText.setText(nation[position]);

        return rowView;

    };
}