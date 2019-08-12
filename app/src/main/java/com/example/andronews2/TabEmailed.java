package com.example.andronews2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.andronews2.MainActivity.linearLayout;

public class TabEmailed extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab, container, false);
        linearLayout.setBackgroundColor(Color.rgb(0, 255, 0));
        return rootView;
    }
}
