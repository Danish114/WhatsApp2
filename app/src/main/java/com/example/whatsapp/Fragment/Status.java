package com.example.whatsapp.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.whatsapp.Activity.StatusTyping;
import com.example.whatsapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Status extends Fragment {
    FloatingActionButton btnflotpen,btnflotcmra;


    public Status() {


    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.status,container,false);
        btnflotpen=view.findViewById(R.id.btnflotpen);
        btnflotcmra=view.findViewById(R.id.btnflotcmra);
        return view;



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnflotpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),StatusTyping.class);
                startActivity(i);
            }
        });
        btnflotcmra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), Camera.class);
                startActivity(i);
            }
        });




    }






}
