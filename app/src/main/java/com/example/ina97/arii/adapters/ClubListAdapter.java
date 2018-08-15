package com.example.ina97.arii.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ina97.arii.Items.ItemClubNews;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class ClubListAdapter extends RecyclerView.Adapter<ClubListHolder> {
    private ArrayList<ItemClubNews> mlist;
    Context mContext;

    @NonNull
    @Override
    public ClubListHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club_list, viewGroup,false);
        mContext=viewGroup.getContext();
        ClubListHolder holder = new ClubListHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubListHolder clubListHolder, int i) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
