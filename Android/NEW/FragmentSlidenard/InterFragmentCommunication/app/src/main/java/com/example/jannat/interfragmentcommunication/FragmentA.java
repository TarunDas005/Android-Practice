package com.example.jannat.interfragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by JANNAT on 5/7/2016.
 */
public class FragmentA extends Fragment implements View.OnClickListener{
    int topCount=0,bottomCount=0;
    Button topButton,bottomButton;
    Communicator comm;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null)//Fragment A Create First Time
        {
            topCount=0;
            bottomCount=0;
        }else{
            topCount=savedInstanceState.getInt("TopCounter",0);
            bottomCount=savedInstanceState.getInt("BottomCount",0);
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        topButton= (Button) getActivity().findViewById(R.id.topButton);
        bottomButton= (Button) getActivity().findViewById(R.id.bottomButton);
        comm= (Communicator) getActivity();
        topButton.setOnClickListener(this);
        bottomButton.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("TopCounter", topCount);
        outState.putInt("BottomCount",bottomCount);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.topButton:
                ++topCount;
                comm.topRespond("Top Button Click: "+topCount);
                break;
            case R.id.bottomButton:
                ++bottomCount;
                comm.bottomRespond("Bottom Button Click: "+bottomCount);
                break;
        }
    }
}
