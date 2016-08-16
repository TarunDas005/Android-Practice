package com.example.jannat.interfragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JANNAT on 5/7/2016.
 */
public class TopFragment extends Fragment {
    String data;
    TextView topTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top_fragment,container,false);
        if(savedInstanceState==null){

        }else{
            data=savedInstanceState.getString("topData");
            TextView myText= (TextView) view.findViewById(R.id.topTextView);
            myText.setText(data);
        }
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        topTextView= (TextView) getActivity().findViewById(R.id.topTextView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("topData",data);
    }

    public void changeTopText(String data){
        this.data=data;
        topTextView.setText(data);
    }
}
