package com.goldenkyds.kydsmvp.view.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.goldenkyds.kydsmvp.R;

/**
 * Created by gguser on 6/26/15.
 */
public class SampleRecycleViewAdapter extends RecyclerView.Adapter<SampleRecycleViewAdapter.ViewHolder>{




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        CardView v = (CardView)LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_card,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.description.setText("Hello, World");
    }


    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView description;
        public ViewHolder(CardView v) {
            super(v);
            description = (TextView)v.findViewById(R.id.description);
        }
    }
}
