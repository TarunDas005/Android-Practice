package com.example.jannat.practiceonfragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {
    private static EditText nameTextField,idTextField;

    TopSectionListner activityCommander;

    public interface TopSectionListner{
        public void CreateMeme(String name,String id);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander=(TopSectionListner)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top_section_fragment,container,false);
        nameTextField=(EditText)view.findViewById(R.id.nameTextField);
        idTextField=(EditText)view.findViewById(R.id.idTextField);
        final Button clickButton=(Button)view.findViewById(R.id.topClickButton);
        final Button resetButton=(Button)view.findViewById(R.id.resetButton);
        clickButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       ButtonOnClick(v);
                    }
                }
        );

        resetButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ButtonOnReset(v);
                    }
                }
        );
        return view;
    }

    private void ButtonOnReset(View v) {
        nameTextField.setText("");
        idTextField.setText("");
        activityCommander.CreateMeme("","");
    }

    private void ButtonOnClick(View v) {
        activityCommander.CreateMeme(nameTextField.getText().toString(),idTextField.getText().toString());
    }
}
