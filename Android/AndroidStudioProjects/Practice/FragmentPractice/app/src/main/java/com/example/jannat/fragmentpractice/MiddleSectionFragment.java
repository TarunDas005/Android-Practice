package com.example.jannat.fragmentpractice;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by JANNAT on 3/17/2016.
 */
public class MiddleSectionFragment extends Fragment {

    private EditText lastNameTextInput;
    private Button clickButton;

    MiddleSectionListner activityCommander;
    public interface MiddleSectionListner {
        public void CreateMeme(String lastName);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (MiddleSectionListner) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.middle_section_fragment,container,false);
        lastNameTextInput=(EditText)view.findViewById(R.id.lastNameTextInput);
        clickButton=(Button)view.findViewById(R.id.clickButton);
        clickButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ButtonClick(v);
                    }
                }
        );
        return view;
    }

    private void ButtonClick(View v) {
        activityCommander.CreateMeme(lastNameTextInput.getText().toString());
    }
}
