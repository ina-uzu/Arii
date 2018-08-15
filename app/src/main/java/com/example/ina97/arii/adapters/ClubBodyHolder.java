package com.example.ina97.arii.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ina97.arii.R;

public class ClubBodyHolder extends RecyclerView.ViewHolder {
    TextView date,title,cont;
    public ClubBodyHolder(@NonNull View itemView) {
        super(itemView);
        date = itemView.findViewById(R.id.date);
        title= itemView.findViewById(R.id.title);
        cont = itemView.findViewById(R.id.cont);
    }
}
