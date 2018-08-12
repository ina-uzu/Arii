package com.example.ina97.arii.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ina97.arii.Items.Item_club_news;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class NewsViewAdapter extends RecyclerView.Adapter<NewsHolder> {
    private ArrayList<Item_club_news> mlist;
    Context mContext;

    public NewsViewAdapter(ArrayList<Item_club_news> list){
        this.mlist=list;
    }

    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club_news, viewGroup,false);
        mContext=viewGroup.getContext();
        NewsHolder holder = new NewsHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsHolder newsHolder, final int i) {
        newsHolder.tv_title.setText(mlist.get(i).getTitle());
        newsHolder.tv_cont.setText(mlist.get(i).getCont());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}
