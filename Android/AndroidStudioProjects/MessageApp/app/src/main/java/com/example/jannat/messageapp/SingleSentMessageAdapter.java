package com.example.jannat.messageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JANNAT on 4/4/2016.
 */
public class SingleSentMessageAdapter extends ArrayAdapter {
    //List list=new ArrayList();
    ArrayList<SmsSentInformation> mLs;
    Context mContext;
    public SingleSentMessageAdapter(Context context, int resource,ArrayList<SmsSentInformation> ls) {
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
        SmsSentInformation smsSentInformation;
        smsSentInformation=(SmsSentInformation)mLs.get(position);
        handler.personName.setText(smsSentInformation.getReceiverNumber());
        handler.messageBody.setText(smsSentInformation.getReceiverMessage());
        handler.time.setText(smsSentInformation.getSendingtime());
        return row;
    }

    public void ClearData(){
        mLs.clear();
    }
}
