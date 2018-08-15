package com.example.ina97.arii.club;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Items.ItemClubList;
import com.example.ina97.arii.R;
import com.example.ina97.arii.adapters.ClubListAdapter;

import java.util.ArrayList;

public class ClubListActivity extends BaseActivity{
    TextView tv_title;

    RecyclerView rv_club_list;
    ClubListAdapter clubListAdapter;
    LinearLayoutManager layoutManager;
    ArrayList<ItemClubList> club_list;

    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);setContentView(R.layout.main_search);

        setContentView(R.layout.club_list);
        tv_title = findViewById(R.id.tv_title);
        rv_club_list =findViewById(R.id.rv_club_list);

    }


}
