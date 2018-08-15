package com.example.ina97.arii.adapters;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ina97.arii.Items.ItemMyclub;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class BottomViewAdapter extends RecyclerView.Adapter<BottomHolder> {
    private ArrayList<ItemMyclub> mlist;
    Context mContext;

    public BottomViewAdapter(ArrayList<ItemMyclub> list){
        this.mlist = list;
    }

    @NonNull
    @Override
    public BottomHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_myclub, viewGroup,false);
        mContext=viewGroup.getContext();
        BottomHolder holder = new BottomHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BottomHolder bottomHolder, int i) {
        bottomHolder.logo.setImageResource(mlist.get(i).getImgId());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            bottomHolder.logo.setBackground(new ShapeDrawable(new OvalShape()));
        }

    }
    @Override
    public int getItemCount() {
        return mlist.size();
    }
}
