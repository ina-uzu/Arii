package com.example.ina97.arii.adapters;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ina97.arii.Items.ItemClubNews;
import com.example.ina97.arii.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsViewAdapter extends RecyclerView.Adapter<NewsHolder> {
    private ArrayList<ItemClubNews> mlist;
    Context mContext;

    public NewsViewAdapter(ArrayList<ItemClubNews> list){
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

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(@NonNull NewsHolder newsHolder, final int i) {
        newsHolder.tv_title.setText(mlist.get(i).getTitle());
        newsHolder.tv_cont.setText(mlist.get(i).getCont());

        Picasso.with(mContext).load(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher_round).into(newsHolder.img_logo);
        Picasso.with(mContext).load(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher_round).into(newsHolder.img_main);

        newsHolder.img_logo.setBackground(new ShapeDrawable(new OvalShape()));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            newsHolder.img_logo.setClipToOutline(true);
        }
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}
