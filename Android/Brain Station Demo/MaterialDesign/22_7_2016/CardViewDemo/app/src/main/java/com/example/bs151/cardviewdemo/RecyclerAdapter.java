package com.example.bs151.cardviewdemo;

import android.content.Context;
import android.content.Intent;
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
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    private ArrayList<PLayer> pLayers=new ArrayList<PLayer>();
    Context context;
    public RecyclerAdapter(ArrayList<PLayer> pLayers,Context context) {
        this.pLayers = pLayers;
        this.context=context;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        RecyclerHolder recyclerHolder=new RecyclerHolder(view,context,pLayers);
        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        PLayer pLayer=pLayers.get(position);
        holder.imageView.setImageResource(pLayer.getImageId());
        holder.nameTextView.setText(pLayer.getName());
        holder.roleTextView.setText(pLayer.getRole());
        holder.phoneTextView.setText(pLayer.getPhone());
    }

    @Override
    public int getItemCount() {
        return pLayers.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView nameTextView,roleTextView,phoneTextView;
        Context context;
        ArrayList<PLayer> pLayers;
        public RecyclerHolder(View itemView,Context context,ArrayList<PLayer> pLayers) {
            super(itemView);
            this.context=context;
            this.pLayers=pLayers;
            itemView.setOnClickListener(this);
            imageView= (ImageView) itemView.findViewById(R.id.imageView);
            nameTextView= (TextView) itemView.findViewById(R.id.nameTextView);
            roleTextView= (TextView) itemView.findViewById(R.id.roleTextView);
            phoneTextView= (TextView) itemView.findViewById(R.id.phoneTextView);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            PLayer pLayer=this.pLayers.get(position);
            Intent intent=new Intent(context,CardViewDetails.class);
            intent.putExtra("player",pLayer);
            this.context.startActivity(intent);
        }
    }
}
