package com.example.sgacc_final;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class frag_app_bar extends Fragment {

    public ImageView notify,nav_bar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_frag_app_bar, container, false);
        notify= view.findViewById(R.id.notification);
        nav_bar= view.findViewById(R.id.menu);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), notification.class);
                startActivity(intent);
            }
        });

        nav_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), nav_bar.class);
                startActivity(intent);

            }
        });

    }
}