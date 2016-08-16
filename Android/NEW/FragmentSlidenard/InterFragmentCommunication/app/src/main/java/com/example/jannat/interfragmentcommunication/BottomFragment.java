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
public class BottomFragment extends Fragment {
    String data;
    TextView bottomTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottom_fragment,container,false);
        if(savedInstanceState==null){

        }else{
            data=savedInstanceState.getString("bottomData");
            TextView myText= (TextView) view.findViewById(R.id.bottomTextView);
            myText.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bottomTextView= (TextView) getActivity().findViewById(R.id.bottomTextView);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("bottomData",data);
    }

    public void changeBottomText(String data){
        this.data=data;
        bottomTextView.setText(data);
    }
}
