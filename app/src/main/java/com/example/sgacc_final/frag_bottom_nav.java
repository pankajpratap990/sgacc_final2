package com.example.sgacc_final;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class frag_bottom_nav extends Fragment {

    ImageView homeicon,donateicon,healthcareicon,phoneicon;
    TextView hometext,donatetext,healthcaretext,phonetext;
    private static final int REQUEST_CALL=1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag_bottom_nav, container, false);
        homeicon=view.findViewById(R.id.homeicon);
        donateicon=view.findViewById(R.id.donateicon);
        healthcareicon=view.findViewById(R.id.healthcareicon);
        phoneicon=view.findViewById(R.id.phoneicon);
        hometext=view.findViewById(R.id.hometext);
        donatetext=view.findViewById(R.id.donatetext);
        healthcaretext=view.findViewById(R.id.healthcaretext);
        phonetext=view.findViewById(R.id.phonetext);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        homeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ho = new Intent(getActivity(), home.class);
                startActivity(ho);
            }
        });

        hometext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ho = new Intent(getActivity(), home.class);
                startActivity(ho);
            }
        });

        healthcareicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ho = new Intent(getActivity(), healthcare.class);
                startActivity(ho);
            }
        });

        healthcaretext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent he = new Intent(getActivity(), healthcare.class);
                startActivity(he);
            }
        });

        donateicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent don = new Intent(getActivity(), donate.class);
                startActivity(don);
            }
        });

        donatetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent don = new Intent(getActivity(), donate.class);
                startActivity(don);
            }
        });

        phoneicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_CALL);
                sendIntent.setData(Uri.parse("tel:"+ "9555461689"));

                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else {
                    startActivity(sendIntent);
                }
            }
        });

        phonetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_CALL);
                sendIntent.setData(Uri.parse("tel:"+ "9555461689"));

                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else {
                    startActivity(sendIntent);
                }
            }
        });
    }
}
