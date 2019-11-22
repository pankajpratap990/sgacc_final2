package com.example.sgacc_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class notification extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        recyclerView = (RecyclerView) findViewById(R.id.notification_re);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<notification_product> myDataset = new ArrayList<notification_product>();
        myDataset.add(new notification_product("10/32/3", "dadasdas ds d f sdf sdf dsf sdf s df jgrnvntlnvdlfsdfsdfsdfdfjnv sfd sd f df ds f sdf sdf sdf ds f sdf sdf s df sdf sdf sd fs dfs df sdf s ds fs dfs d ds f sdf sdf sd f sdf sd f sdf s df sf sdf df sdf sd fs df sdf s f sdf dsf sd fs df sd fs dfs s f sddf s df sd fsd f df sdf abhishek"));
        myDataset.add(new notification_product("20may", "dadasdasdsd"));
        myDataset.add(new notification_product("yash a", "dadasdasdsd"));
        myDataset.add(new notification_product("yash", "dadasdasdsd"));
        myDataset.add(new notification_product("yash", "dadasdasdsd"));
        myDataset.add(new notification_product("yash", "dadasdasdsd"));

        mAdapter = new notification_adapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }
}