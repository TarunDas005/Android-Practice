package com.example.jannat.practiceonfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class MiddleSectionFragment extends Fragment {

    private static EditText nameShowTextField;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.middle_section_fragment,container,false);
        nameShowTextField=(EditText)view.findViewById(R.id.nameShowTextField);
        return view;
    }

    public void nameSetText(String name)
    {
        //Log.e("Value",name);
        nameShowTextField.setText(name);
    }
}
