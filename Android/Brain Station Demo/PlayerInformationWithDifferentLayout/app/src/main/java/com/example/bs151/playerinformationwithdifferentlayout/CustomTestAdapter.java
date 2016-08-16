package com.example.bs151.playerinformationwithdifferentlayout;

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
    ArrayList<Player> players=new ArrayList<Player>();

    public CustomTestAdapter(Context context, ArrayList<Player> players) {
        super(context, R.layout.allrounder_layout);
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
        ImageView imageView;
        TextView nameTextView, battingStyleTextView, bowlingStyleTextView, battingAverageT20TextView, bowlingAverageT20TextView, battingAverageODITextView, bowlingAverageODITextView, roleTextView;
    }


    public void setTextDoc(DataHandler handler, Player player) {
        handler.imageView.setImageResource(player.getImageId());
        handler.nameTextView.setText(player.getName());
        handler.battingStyleTextView.setText("Bat. style: " + player.getBatingStyle());
        handler.bowlingStyleTextView.setText("Bow. style: " + player.getBowlingStyle());
        handler.battingAverageT20TextView.setText("Bat. Avg(T20): " + player.getBatingAvgInT20() + "");
        handler.battingAverageODITextView.setText("Bat. Avg(ODI): " + player.getBatingAvgInODI() + "");
        handler.bowlingAverageT20TextView.setText("Bow. Avg(T20): " + player.getBowlingAvgInT20() + "");
        handler.bowlingAverageODITextView.setText("Bow. Avg(ODI): " + player.getBowlingAvgInODI() + "");
        handler.roleTextView.setText(player.getRole());
    }

    public DataHandler getFindViewById(DataHandler handler,View view){
        handler.imageView = (ImageView) view.findViewById(R.id.imageView);
        handler.nameTextView = (TextView) view.findViewById(R.id.nameTextView);
        handler.battingStyleTextView = (TextView) view.findViewById(R.id.battingStyleTextView);
        handler.bowlingStyleTextView = (TextView) view.findViewById(R.id.bowlingStyleTextView);
        handler.battingAverageT20TextView = (TextView) view.findViewById(R.id.battingAverageT20TextView);
        handler.bowlingAverageT20TextView = (TextView) view.findViewById(R.id.bowlingAverageT20TextView);
        handler.battingAverageODITextView = (TextView) view.findViewById(R.id.battingAverageODITextView);
        handler.bowlingAverageODITextView = (TextView) view.findViewById(R.id.bowlingAverageODITextView);
        handler.roleTextView = (TextView) view.findViewById(R.id.roleTextView);
        return handler;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = convertView;
        DataHandler handler;
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        handler = new DataHandler();
        Player player;
        player = (Player) this.getItem(position);
        if (player.getRole().equals("Allrounder")) {
            view = inflater.inflate(R.layout.allrounder_layout, parent, false);
            DataHandler dataHandler=getFindViewById(handler,view);
            setTextDoc(dataHandler,player);
        } else if (player.getRole().equals("Bowler")) {
            view = inflater.inflate(R.layout.bowler_layout, parent, false);
            DataHandler dataHandler=getFindViewById(handler,view);
            setTextDoc(dataHandler,player);
        } else if (player.getRole().equals("batsman")) {
            view = inflater.inflate(R.layout.batsman_layout, parent, false);
            DataHandler dataHandler=getFindViewById(handler,view);
            setTextDoc(dataHandler,player);
        } else {
            view = inflater.inflate(R.layout.wicketkeeper_layout, parent, false);
            DataHandler dataHandler=getFindViewById(handler,view);
            setTextDoc(dataHandler,player);
        }
        return view;
    }
}
