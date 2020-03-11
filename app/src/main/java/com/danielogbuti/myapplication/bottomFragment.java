package com.danielogbuti.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;



public class bottomFragment extends Fragment{
    private TextView topText;
    private TextView bottomText;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottomfragment,container,false);
        topText = (TextView) view.findViewById(R.id.topText);
        bottomText = (TextView) view.findViewById(R.id.bottomText);
        return view;
    }

    public void setMeme(String top,String bottom){
        topText.setText(top);
        bottomText.setText(bottom);
    }
}
