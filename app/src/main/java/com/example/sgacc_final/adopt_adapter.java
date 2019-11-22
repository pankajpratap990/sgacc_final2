package com.example.sgacc_final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Vector;

public class adopt_adapter extends RecyclerView.Adapter<adopt_adapter.MyViewHolder> {
    private ArrayList<adopt_product> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageView imageView;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.adopt_list_name);
            imageView = v.findViewById(R.id.adopt_list_image);
        }
    }

    public adopt_adapter(ArrayList<adopt_product> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public adopt_adapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {

        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adopt_list, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        adopt_product pro = (adopt_product) mDataset.get(position);
        holder.imageView.setImageResource(pro.getImg());
        holder.textView.setText(pro.getName());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}