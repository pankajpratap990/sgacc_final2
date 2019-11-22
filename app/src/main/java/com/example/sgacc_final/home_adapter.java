package com.example.sgacc_final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class home_adapter extends RecyclerView.Adapter<home_adapter.MyViewHolder> {

    private ArrayList<home_product> mDataset;

    public home_adapter(ArrayList<home_product> myDataset) {
        mDataset = myDataset;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView home_description,home_title;
        public ImageView imge;
        public MyViewHolder(View v) {
            super(v);
            home_title = v.findViewById(R.id.home_title);
            home_description=v.findViewById(R.id.home_description);
            imge=v.findViewById(R.id.home_image);
        }
    }

    @Override
    public home_adapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_list, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        home_product home_pro= (home_product) mDataset.get(position);
        holder.home_title.setText(home_pro.getTitle());
        holder.home_description.setText(home_pro.getDescription());
        holder.imge.setImageResource(home_pro.getImg());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
