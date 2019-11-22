package com.example.sgacc_final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class notification_adapter extends RecyclerView.Adapter<notification_adapter.MyViewHolder> {
    private ArrayList<notification_product> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView date,detail;
        public MyViewHolder(View v) {
            super(v);
            date  =v.findViewById(R.id.date);
            detail=v.findViewById(R.id.detail);
        }
    }

    public notification_adapter(ArrayList<notification_product> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public notification_adapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_list, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        notification_product rsg=(notification_product) mDataset.get(position);
        holder.date.setText(rsg.getDate());
        holder.detail.setText(rsg.getDetail());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}