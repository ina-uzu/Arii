package com.example.ina97.arii.club;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.R;
import com.example.ina97.arii.main.MainActivity;

public class ClubMemberActiivty extends BaseActivity {
    RecyclerView rv_member;

    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_member);
        rv_member = findViewById(R.id.rv_club_member);
    }


}
