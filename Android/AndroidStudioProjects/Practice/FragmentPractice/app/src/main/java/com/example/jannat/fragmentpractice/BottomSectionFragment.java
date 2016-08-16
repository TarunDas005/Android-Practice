package com.example.jannat.fragmentpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JANNAT on 3/17/2016.
 */
public class BottomSectionFragment extends Fragment {

    private TextView topText,bottomtext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottom_section_fragment,container,false);
        topText=(TextView)view.findViewById(R.id.topText);
        bottomtext=(TextView)view.findViewById(R.id.bottomText);
        return view;
    }

    public void setAllText(String firstName,String lastName){
        topText.setText(firstName);
        bottomtext.setText(lastName);
    }
}
