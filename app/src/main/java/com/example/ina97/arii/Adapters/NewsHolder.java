package com.example.ina97.arii.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ina97.arii.R;

class NewsHolder extends RecyclerView.ViewHolder {
    protected TextView tv_title;
    protected TextView tv_cont;

    public NewsHolder(@NonNull View itemView) {
        super(itemView);
        tv_title  = itemView.findViewById(R.id.title);
        tv_cont = itemView.findViewById(R.id.cont);
    }
}