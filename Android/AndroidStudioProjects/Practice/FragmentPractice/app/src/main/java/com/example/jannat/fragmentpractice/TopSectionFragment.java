package com.example.jannat.fragmentpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by JANNAT on 3/17/2016.
 */
public class TopSectionFragment extends Fragment {

    private EditText firstNameText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top_section_fragment,container,false);
        firstNameText=(EditText)view.findViewById(R.id.topTextInput);
        return view;
    }

    public String getFirstName(){
        return firstNameText.getText().toString();
    }
}
