package com.example.jannat.memcreatorwithfragment;


import android.app.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragtment extends Fragment {

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListner activityCommander;

    public interface TopSectionListner{
        public void CreateMeme(String top,String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander=(TopSectionListner) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top_section_fragment,container,false);
        topTextInput=(EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput=(EditText)view.findViewById(R.id.bottomTextInput);
        final Button button=(Button)view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonOnClick(v);
                    }


                }
        );
        return view;
    }

    public void buttonOnClick(View view) {
        activityCommander.CreateMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
