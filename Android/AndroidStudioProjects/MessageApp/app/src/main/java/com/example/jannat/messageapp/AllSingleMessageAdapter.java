package com.example.jannat.messageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JANNAT on 4/8/2016.
 */
public class AllSingleMessageAdapter extends ArrayAdapter{
    ArrayList<AllMessage> mLs;
    Context mContext;
    public AllSingleMessageAdapter(Context context, int resource,ArrayList<AllMessage> ls) {
        super(context, resource);
        mContext=context;
        mLs=ls;

    }

    static class DataHandler
    {
        TextView personName,messageCount,messageBody,time;
    }

//    @Override
//    public void add(Object object) {
//        super.add(object);
//        list.add(object);
//    }

    @Override
    public int getCount() {
        return mLs.size();//return total number Of Object in this list
    }

    @Override
    public Object getItem(int position) {
        return mLs.get(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row=convertView;
        DataHandler handler;
        if(convertView==null){
            LayoutInflater inflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(R.layout.message_list,parent,false);
            handler=new DataHandler();
            handler.personName=(TextView)row.findViewById(R.id.personNameTextView);
            handler.messageCount=(TextView)row.findViewById(R.id.messageCountTextView);
            handler.messageBody=(TextView)row.findViewById(R.id.messageBodyTextView);
            handler.time=(TextView)row.findViewById(R.id.timeTextView);
            row.setTag(handler);
        }
        else{
            handler=(DataHandler)row.getTag();
        }
        AllMessage message;
        message=(AllMessage)mLs.get(position);
        String number="";
        String mes="";
        if(message.getReceiverNumber().equals("")){
            number=message.getSenderNumber();
        }
        else
        {
            number=message.getReceiverNumber();
        }
        if(message.getSenderMessage().equals("")){
            mes=message.getReceiverMessage();
        }
        else
        {
            mes=message.getSenderMessage();
        }
        handler.personName.setText(number);
        handler.messageBody.setText(mes);
        handler.time.setText(message.getTime());
        return row;
    }

    public void ClearData(){
        mLs.clear();
    }
}
