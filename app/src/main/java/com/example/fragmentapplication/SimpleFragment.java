package com.example.fragmentapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

import static com.example.fragmentapplication.MainActivity.textView;


public class SimpleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    View view;
    Button button;
    EditText editText;
    static String text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_simple, container, false);
        button=view.findViewById(R.id.button);
        editText=view.findViewById(R.id.edit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Fragement Done", Toast.LENGTH_SHORT).show();
                text =editText.getText().toString().trim();
                textView.setText(text);

                editText.getText().toString();
            }
        });
        return view;
    }
}