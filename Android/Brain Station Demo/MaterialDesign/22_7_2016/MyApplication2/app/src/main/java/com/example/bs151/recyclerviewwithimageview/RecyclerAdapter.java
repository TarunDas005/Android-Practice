package com.example.bs151.recyclerviewwithimageview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BS151 on 7/22/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private ArrayList<DataProvider> dataProviders;
    public RecyclerAdapter(ArrayList<DataProvider> dataProviders) {
        this.dataProviders=dataProviders;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider dataProvider=dataProviders.get(position);
        holder.imageView.setImageResource(dataProvider.getImageId());
        holder.nameTextView.setText(dataProvider.getName());
        holder.roleTextView.setText(dataProvider.getRole());
    }

    @Override
    public int getItemCount() {
        return dataProviders.size();
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView nameTextView,roleTextView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.imageView);
            nameTextView= (TextView) itemView.findViewById(R.id.nameTextView);
            roleTextView= (TextView) itemView.findViewById(R.id.roleTextView);
        }
    }
}
