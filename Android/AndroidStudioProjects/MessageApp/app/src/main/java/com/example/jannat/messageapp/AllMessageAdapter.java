package com.example.jannat.messageapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JANNAT on 4/8/2016.
 */
public class AllMessageAdapter extends ArrayAdapter{
    List list=new ArrayList();

    public AllMessageAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler
    {
        TextView displayMessage,displayTime;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();//return total number Of Object in this list
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View leftRow,rightRow;
        leftRow=convertView;
        rightRow=convertView;
        DataHandler handlerLeft,handlerRight;
        if(convertView==null){
            LayoutInflater inflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            leftRow= inflater.inflate(R.layout.main_left,parent,false);
            rightRow= inflater.inflate(R.layout.main_right,parent,false);
            handlerLeft=new DataHandler();
            handlerRight=new DataHandler();
            handlerLeft.displayMessage=(TextView)leftRow.findViewById(R.id.messageTextView);
            handlerLeft.displayTime=(TextView)leftRow.findViewById(R.id.timeTextView);
            leftRow.setTag(handlerLeft);

            handlerRight.displayMessage=(TextView)rightRow.findViewById(R.id.messageTextView);
            handlerRight.displayTime=(TextView)rightRow.findViewById(R.id.timeTextView);
            rightRow.setTag(handlerRight);

        }
        else{
            handlerLeft=(DataHandler)leftRow.getTag();
            handlerRight=(DataHandler)rightRow.getTag();
        }


        AllMessage message;
        message=(AllMessage)this.getItem(position);
        //Log.e("A: ",message.getIdentifyTag());
        if(message.getIdentifyTag().equals("S")){
            handlerRight.displayMessage.setText(message.getReceiverMessage());
            handlerRight.displayTime.setText(message.getTime());
            return rightRow;
        }
        else{
            handlerLeft.displayMessage.setText(message.getSenderMessage());
            handlerLeft.displayTime.setText(message.getTime());
            return leftRow;
        }

    }

    /*public void ClearData(){
        list.clear();
    }*/

}
