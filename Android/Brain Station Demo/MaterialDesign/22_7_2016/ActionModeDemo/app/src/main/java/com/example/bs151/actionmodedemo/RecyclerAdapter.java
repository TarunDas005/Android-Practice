package com.example.bs151.actionmodedemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BS151 on 7/22/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    private ArrayList<Player> pLayers = new ArrayList<Player>();
    Context context;
    MainActivity mainActivity;

    public RecyclerAdapter(ArrayList<Player> pLayers, Context context) {
        this.pLayers = pLayers;
        this.context = context;
        mainActivity = (MainActivity) context;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout, parent, false);
        RecyclerHolder recyclerHolder = new RecyclerHolder(view, mainActivity);
        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        Player pLayer = pLayers.get(position);
        holder.imageView.setImageResource(pLayer.getImageId());
        holder.nameTextView.setText(pLayer.getName());
        holder.roleTextView.setText(pLayer.getRole());
        if (!mainActivity.is_in_action_mode){
            holder.checkBox.setVisibility(View.GONE);
        }else{
            holder.checkBox.setVisibility(View.VISIBLE);
            holder.checkBox.setChecked(false);
        }
    }

    @Override
    public int getItemCount() {
        return pLayers.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView nameTextView, roleTextView;
        CheckBox checkBox;
        MainActivity mainActivity;
        CardView cardView;
        public RecyclerHolder(View itemView, MainActivity mainActivity) {
            super(itemView);
            this.mainActivity = mainActivity;
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            roleTextView = (TextView) itemView.findViewById(R.id.roleTextView);
            checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
            cardView= (CardView) itemView.findViewById(R.id.cardView);
            cardView.setOnLongClickListener(mainActivity);
            checkBox.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            mainActivity.PrepareSelection(view,getAdapterPosition());
        }
    }

    public void updateAdapter(ArrayList<Player> list){
        for(Player player:list){
            pLayers.remove(player);
        }
        notifyDataSetChanged();
    }
}
