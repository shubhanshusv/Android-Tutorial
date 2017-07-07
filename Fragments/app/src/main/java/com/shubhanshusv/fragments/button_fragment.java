package com.shubhanshusv.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;    // importing fragment
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class button_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // layout of fragment

        View view = inflater.inflate(R.layout.fragment_button, container, false);
        return view;
    }
}
