package com.example.sgacc_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Vector;

public class home extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = (RecyclerView) findViewById(R.id.home_re);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<home_product> myDataset=new ArrayList<home_product>();
        myDataset.add(new home_product("dsa","ad",R.drawable.ferrari));
        myDataset.add(new home_product("dsa","ad",R.drawable.ferrari));
        myDataset.add(new home_product("dsa","ad",R.drawable.ferrari));

        mAdapter = new home_adapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user == null) {

            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        }
    }

    public void adopt(View view){
        Intent intent = new Intent(this, adopt.class);
        startActivity(intent);
    }
}
