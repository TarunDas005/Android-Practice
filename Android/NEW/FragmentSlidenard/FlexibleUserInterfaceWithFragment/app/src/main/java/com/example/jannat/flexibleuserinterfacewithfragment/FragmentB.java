package com.example.jannat.flexibleuserinterfacewithfragment;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JANNAT on 5/7/2016.
 */
public class FragmentB extends Fragment {
    TextView textView;
    String data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView= (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("data",data);
    }

    public void saveData(int i){
        Resources res=getResources();
        String[] descriptions=res.getStringArray(R.array.descriptions);
        this.data=descriptions[i];
        TextView myTextView=(TextView) getActivity().findViewById(R.id.textView);
        myTextView.setText(descriptions[i]);
    }

    public void setData(int i){
        Resources res=getResources();
        String[] descriptions=res.getStringArray(R.array.descriptions);
        this.data=descriptions[i];
        textView.setText(descriptions[i]);
    }
}