package com.example.bs151.playerinformationdemo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BS151 on 7/20/2016.
 */
public class CustomTestAdapter extends ArrayAdapter<Player> {
    ArrayList<Player> players;

    public CustomTestAdapter(Context context, ArrayList<Player> players) {
        super(context, R.layout.raw_layout);
        this.players = players;
    }

    @Override
    public int getCount() {
        return this.players.size();
    }

    @Override
    public Player getItem(int position) {
        return this.players.get(position);
    }

    static class DataHandler {
        RelativeLayout layout;
        ImageView imageView;
        TextView nameTextView, battingStyleTextView, bowlingStyleTextView, battingAverageT20TextView, bowlingAverageT20TextView, battingAverageODITextView, bowlingAverageODITextView, roleTextView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view=convertView;
        DataHandler handler;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.raw_layout, parent, false);
            handler = new DataHandler();
            handler.layout= (RelativeLayout) view.findViewById(R.id.layout);
            handler.imageView = (ImageView) view.findViewById(R.id.imageView);
            handler.nameTextView = (TextView) view.findViewById(R.id.nameTextView);
            handler.battingStyleTextView = (TextView) view.findViewById(R.id.battingStyleTextView);
            handler.bowlingStyleTextView = (TextView) view.findViewById(R.id.bowlingStyleTextView);
            handler.battingAverageT20TextView = (TextView) view.findViewById(R.id.battingAverageT20TextView);
            handler.bowlingAverageT20TextView = (TextView) view.findViewById(R.id.bowlingAverageT20TextView);
            handler.battingAverageODITextView = (TextView) view.findViewById(R.id.battingAverageODITextView);
            handler.bowlingAverageODITextView = (TextView) view.findViewById(R.id.bowlingAverageODITextView);
            handler.roleTextView = (TextView) view.findViewById(R.id.roleTextView);
            view.setTag(handler);
        }else{
            handler = (DataHandler) view.getTag();
        }
        Player player;
        player=(Player) this.getItem(position);
        if (player.getRole().equals("Allrounder")) {
            handler.layout.setBackgroundColor(Color.parseColor("#33f901"));
            handler.imageView.setImageResource(player.getImageId());
            handler.nameTextView.setText(player.getName());
            handler.nameTextView.setTextColor(Color.parseColor("#009C00"));
            handler.battingStyleTextView.setText("Bat. style: "+player.getBatingStyle());
            handler.battingStyleTextView.setTextColor(Color.parseColor("#009C00"));
            handler.bowlingStyleTextView.setText("Bow. style: "+player.getBowlingStyle());
            handler.bowlingStyleTextView.setTextColor(Color.parseColor("#009C00"));
            handler.battingAverageT20TextView.setText("Bat. Avg(T20): "+player.getBatingAvgInT20() + "");
            handler.battingAverageT20TextView.setTextColor(Color.parseColor("#009C00"));
            handler.battingAverageODITextView.setText("Bat. Avg(ODI): "+player.getBatingAvgInODI() + "");
            handler.battingAverageODITextView.setTextColor(Color.parseColor("#009C00"));
            handler.bowlingAverageT20TextView.setText("Bow. Avg(T20): "+player.getBowlingAvgInT20() + "");
            handler.bowlingAverageT20TextView.setTextColor(Color.parseColor("#009C00"));
            handler.bowlingAverageODITextView.setText("Bow. Avg(ODI): "+player.getBowlingAvgInODI() + "");
            handler.bowlingAverageODITextView.setTextColor(Color.parseColor("#009C00"));
            handler.roleTextView.setText(player.getRole());
            handler.roleTextView.setTextColor(Color.parseColor("#009C00"));
        }else if (player.getRole().equals("Bowler")){
            handler.layout.setBackgroundColor(Color.parseColor("#0105f9"));
            handler.imageView.setImageResource(player.getImageId());
            handler.nameTextView.setText(player.getName());
            handler.nameTextView.setTextColor(Color.parseColor("#00FF00"));
            handler.battingStyleTextView.setText("Bat. style: "+player.getBatingStyle());
            handler.battingStyleTextView.setTextColor(Color.parseColor("#00FF00"));
            handler.bowlingStyleTextView.setText("Bow. style: "+player.getBowlingStyle());
            handler.bowlingStyleTextView.setTextColor(Color.parseColor("#00FF00"));
            handler.battingAverageT20TextView.setText("Bat. Avg(T20): "+player.getBatingAvgInT20() + "");
            handler.battingAverageT20TextView.setTextColor(Color.parseColor("#00FF00"));
            handler.battingAverageODITextView.setText("Bat. Avg(ODI): "+player.getBatingAvgInODI() + "");
            handler.battingAverageODITextView.setTextColor(Color.parseColor("#00FF00"));
            handler.bowlingAverageT20TextView.setText("Bow. Avg(T20): "+player.getBowlingAvgInT20() + "");
            handler.bowlingAverageT20TextView.setTextColor(Color.parseColor("#00FF00"));
            handler.bowlingAverageODITextView.setText("Bow. Avg(ODI): "+player.getBowlingAvgInODI() + "");
            handler.bowlingAverageODITextView.setTextColor(Color.parseColor("#00FF00"));
            handler.roleTextView.setText(player.getRole());
            handler.roleTextView.setTextColor(Color.parseColor("#00FF00"));
        }else if (player.getRole().equals("batsman")) {
            handler.layout.setBackgroundColor(Color.parseColor("#f901e0"));
            handler.imageView.setImageResource(player.getImageId());
            handler.nameTextView.setText(player.getName());
            handler.nameTextView.setTextColor(Color.parseColor("#FFCCFF"));
            handler.battingStyleTextView.setText("Bat. style: "+player.getBatingStyle());
            handler.battingStyleTextView.setTextColor(Color.parseColor("#FFCCFF"));
            handler.bowlingStyleTextView.setText("Bow. style: "+player.getBowlingStyle());
            handler.bowlingStyleTextView.setTextColor(Color.parseColor("#FFCCFF"));
            handler.battingAverageT20TextView.setText("Bat. Avg(T20): "+player.getBatingAvgInT20() + "");
            handler.battingAverageT20TextView.setTextColor(Color.parseColor("#FFCCFF"));
            handler.battingAverageODITextView.setText("Bat. Avg(ODI): "+player.getBatingAvgInODI() + "");
            handler.battingAverageODITextView.setTextColor(Color.parseColor("#FFCCFF"));
            handler.bowlingAverageT20TextView.setText("Bow. Avg(T20): "+player.getBowlingAvgInT20() + "");
            handler.bowlingAverageT20TextView.setTextColor(Color.parseColor("#FFCCFF"));
            handler.bowlingAverageODITextView.setText("Bow. Avg(ODI): "+player.getBowlingAvgInODI() + "");
            handler.bowlingAverageODITextView.setTextColor(Color.parseColor("#FFCCFF"));
            handler.roleTextView.setText(player.getRole());
            handler.roleTextView.setTextColor(Color.parseColor("#FFCCFF"));
        }else{
            handler.layout.setBackgroundColor(Color.parseColor("#f90101"));
            handler.imageView.setImageResource(player.getImageId());
            handler.nameTextView.setText(player.getName());
            handler.nameTextView.setTextColor(Color.parseColor("#000000"));
            handler.battingStyleTextView.setText("Bat. style: "+player.getBatingStyle());
            handler.battingStyleTextView.setTextColor(Color.parseColor("#000000"));
            handler.bowlingStyleTextView.setText("Bow. style: "+player.getBowlingStyle());
            handler.bowlingStyleTextView.setTextColor(Color.parseColor("#000000"));
            handler.battingAverageT20TextView.setText("Bat. Avg(T20): "+player.getBatingAvgInT20() + "");
            handler.battingAverageT20TextView.setTextColor(Color.parseColor("#000000"));
            handler.battingAverageODITextView.setText("Bat. Avg(ODI): "+player.getBatingAvgInODI() + "");
            handler.battingAverageODITextView.setTextColor(Color.parseColor("#000000"));
            handler.bowlingAverageT20TextView.setText("Bow. Avg(T20): "+player.getBowlingAvgInT20() + "");
            handler.bowlingAverageT20TextView.setTextColor(Color.parseColor("#000000"));
            handler.bowlingAverageODITextView.setText("Bow. Avg(ODI): "+player.getBowlingAvgInODI() + "");
            handler.bowlingAverageODITextView.setTextColor(Color.parseColor("#000000"));
            handler.roleTextView.setText(player.getRole());
            handler.roleTextView.setTextColor(Color.parseColor("#000000"));
        }
        return view;
    }
}
