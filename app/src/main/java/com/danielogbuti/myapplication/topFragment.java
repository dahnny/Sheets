package com.danielogbuti.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.Button;
import android.app.Activity;

public class topFragment extends Fragment{

    private  EditText TopTextInput;
    private Button button;
    private EditText bottomTextInput;

    TopSectionListener activityCommander;
    public interface TopSectionListener{
         void createMeme(String top,String Bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.topfragment,container,false);


        TopTextInput = (EditText)view.findViewById(R.id.TopTextInput);
        bottomTextInput = (EditText)view.findViewById(R.id.BottomTextInput);
        button = (Button)view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clicked(v);
                    }
                }
        );
        return view;

    }
    public void clicked(View view){
        activityCommander.createMeme(TopTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
