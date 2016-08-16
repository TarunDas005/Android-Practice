package com.example.jannat.smsschedular;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JANNAT on 4/29/2016.
 */
public class CustomAdapter extends ArrayAdapter<MessageList> {

    Activity context;
    ArrayList<MessageList> msgLists;
    public CustomAdapter(Context context, ArrayList<MessageList> lists) {
        super(context, R.layout.show_list, lists);
        this.context= (Activity) context;
        this.msgLists=lists;
    }
    @Override
    public int getViewTypeCount() {

        return getCount();
    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if(convertView==null){
            LayoutInflater inflater=context.getLayoutInflater();
            v=inflater.inflate(R.layout.show_list,null);
            TextView number=(TextView)v.findViewById(R.id.customNumberTextView);
            TextView messgae=(TextView)v.findViewById(R.id.customBodyTextView);
            TextView time=(TextView)v.findViewById(R.id.customeTimeTextView);
            MessageList list1=msgLists.get(position);
            number.setText(list1.getNumber());
            messgae.setText(list1.getBody());
            time.setText(list1.getTime());
        }else{
            v=convertView;
        }
        return v;
    }
}
