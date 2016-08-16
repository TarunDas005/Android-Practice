package com.example.jannat.practiceonfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class BottomSectionFragment extends Fragment {

    private static EditText idShowTextField;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottom_section_fragment,container,false);
        idShowTextField=(EditText)view.findViewById(R.id.idShowTextField);
        return view;
    }

    public void idSetText(String id){
        idShowTextField.setText(id);
    }
}
