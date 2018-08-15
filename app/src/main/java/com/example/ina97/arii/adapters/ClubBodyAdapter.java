package com.example.ina97.arii.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ina97.arii.Items.ItemClubBody;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class ClubBodyAdapter extends RecyclerView.Adapter<ClubBodyHolder> {
    ArrayList <ItemClubBody> mlist;
    Context mContext;

    public ClubBodyAdapter(ArrayList<ItemClubBody> list){
        this.mlist=list;
    }

    @NonNull
    @Override
    public ClubBodyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club_body, viewGroup,false);
        mContext=viewGroup.getContext();
        ClubBodyHolder holder = new ClubBodyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubBodyHolder clubBodyHolder, int i) {
        clubBodyHolder.date.setText(mlist.get(i).getDate());
        clubBodyHolder.title.setText(mlist.get(i).getTitle());
        clubBodyHolder.cont.setText(mlist.get(i).getCont());
    }

    @Override
    public int getItemCount() {
        return this.mlist.size();
    }
}
