package com.example.ina97.arii.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.ina97.arii.R;

class BottomHolder extends RecyclerView.ViewHolder {
    protected ImageView logo;
    public BottomHolder(@NonNull View itemView) {
        super(itemView);
        logo = itemView.findViewById(R.id.logo);
    }
}
