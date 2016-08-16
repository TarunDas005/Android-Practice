package com.example.jannat.customlistviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by JANNAT on 3/26/2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row,foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View view=layoutInflater.inflate(R.layout.custom_row, parent, false);
        String selecName=getItem(position);
        ImageView imageView=(ImageView)view.findViewById(R.id.aronnoImageview);
        TextView textView=(TextView)view.findViewById(R.id.aronnoText);

        imageView.setImageResource(R.drawable.a);
        textView.setText(selecName);
        return view;

    }
}
