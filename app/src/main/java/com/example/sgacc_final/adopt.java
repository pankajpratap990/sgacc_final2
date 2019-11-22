package com.example.sgacc_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Vector;

public class adopt extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);

        recyclerView = (RecyclerView) findViewById(R.id.adopt_re);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<adopt_product> myDataset = new ArrayList<adopt_product>();

        myDataset.add(new adopt_product("fds",R.drawable.ic_launcher_background));
        myDataset.add(new adopt_product("fsdfsdds",R.drawable.ic_launcher_background));
        myDataset.add(new adopt_product("fsvs",R.drawable.ic_launcher_background));
        myDataset.add(new adopt_product("fsfsdfaasdasdfsdfsfs",R.drawable.ic_launcher_background));
        myDataset.add(new adopt_product("fs",R.drawable.ic_launcher_background));
        myDataset.add(new adopt_product("fds",R.drawable.ic_launcher_background));
        myDataset.add(new adopt_product("fds",R.drawable.ic_launcher_background));

        mAdapter = new adopt_adapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }
}
