package com.example.bs151.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BS151 on 7/21/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    ArrayList<String> country=new ArrayList<String>();
    ArrayList<String> capital=new ArrayList<String>();
    public RecyclerAdapter(ArrayList<String> country,ArrayList<String> capital) {
        this.country=country;
        this.capital=capital;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.countryNameTextView.setText(country.get(position));
        holder.capitalTextView.setText(capital.get(position));
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView countryNameTextView,capitalTextView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            countryNameTextView= (TextView) itemView.findViewById(R.id.countryTextView);
            capitalTextView= (TextView) itemView.findViewById(R.id.capitalTextView);
        }
    }
    @Override
    public int getItemCount() {
        return country.size();
    }
}
