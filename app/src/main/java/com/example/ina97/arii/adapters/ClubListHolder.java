package com.example.ina97.arii.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ina97.arii.R;

public class ClubListHolder extends RecyclerView.ViewHolder {
    ImageView club_img;
    TextView club_name;

    public ClubListHolder(@NonNull View itemView) {
        super(itemView);
        club_img = itemView.findViewById(R.id.club_img);
        club_name = itemView.findViewById(R.id.club_name);
    }
}
