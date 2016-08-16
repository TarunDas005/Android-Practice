package com.example.jannat.androidfragmentmanagerandbackstack;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JANNAT on 5/9/2016.
 */
public class FragmentB extends Fragment {
    @Override
    public void onAttach(Activity activity) {
        Log.d("FragmentB", "Fragment B with onAttachh");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("FragmentB","Fragment B with onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("FragmentB","Fragment B with onCreateView");
        View view=inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d("FragmentB","Fragment B with onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        Log.d("FragmentB","Fragment B with onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("FragmentB","Fragment B with onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("FragmentB","Fragment B with onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("FragmentB","Fragment B with onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("FragmentB","Fragment B with onDetach");
        super.onDetach();
    }
}
