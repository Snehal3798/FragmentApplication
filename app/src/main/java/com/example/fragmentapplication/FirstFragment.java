package com.example.fragmentapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


public class FirstFragment extends Fragment {

    Button button;
    ToggleButton toggleButton,toggleButton1;
   View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_first, container, false);
       button =view.findViewById(R.id.button2);
       toggleButton=view.findViewById(R.id.toggleButton);
       toggleButton1=view.findViewById(R.id.toggleButton2);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String status = "ToggleButton" +toggleButton.getText()+"\n"+ "ToggleButton 1"+toggleButton1.getText();
               Toast.makeText(getActivity(),status,  Toast.LENGTH_SHORT).show();
           }
       });
        return view;
    }
}