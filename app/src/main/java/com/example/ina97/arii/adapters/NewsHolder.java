package com.example.ina97.arii.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ina97.arii.R;

class NewsHolder extends RecyclerView.ViewHolder {
    protected TextView tv_title;
    protected TextView tv_cont;
    protected ImageView img_logo, img_main;

    public NewsHolder(@NonNull View itemView) {
        super(itemView);
        tv_title  = itemView.findViewById(R.id.title);
        tv_cont = itemView.findViewById(R.id.cont);
        img_logo=itemView.findViewById(R.id.club_logo);
        img_main=itemView.findViewById(R.id.image);
    }
}
