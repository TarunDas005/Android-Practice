package com.example.bs151.fragmentactivitycommunication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {
    OnColorChangedListner onColorChangedListner;
    RadioGroup radioGroup;
    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_color, container, false);
        radioGroup= (RadioGroup) view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.redId:
                        onColorChangedListner.colorChanged("RED");
                        break;
                    case R.id.blueId:
                        onColorChangedListner.colorChanged("BLUE");
                        break;
                    case R.id.greenId:
                        onColorChangedListner.colorChanged("GREEN");
                        break;
                }
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onColorChangedListner= (OnColorChangedListner) context;
    }

    public interface OnColorChangedListner{
        public void colorChanged(String colorName);
    }

}
