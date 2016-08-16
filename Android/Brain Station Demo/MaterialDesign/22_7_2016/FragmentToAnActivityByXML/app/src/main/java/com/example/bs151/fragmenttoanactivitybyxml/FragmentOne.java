package com.example.bs151.fragmenttoanactivitybyxml;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] versions;
    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_one, container, false);
        listView= (ListView) view.findViewById(R.id.listview);
        versions=getResources().getStringArray(R.array.version_name);
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.listview_layout,R.id.rawItemTextView,versions);
        listView.setAdapter(adapter);
        return view;
    }

}
