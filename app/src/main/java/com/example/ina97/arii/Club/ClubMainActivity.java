package com.example.ina97.arii.Club;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ina97.arii.Adapters.ClubsViewAdapter;
import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Items.Item_myclub;
import com.example.ina97.arii.Main.MainActivity;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class ClubMainActivity extends BaseActivity {

    LinearLayoutManager clubsLayoutManager;
    RecyclerView recyclerViewBottom;
    ClubsViewAdapter clubsViewAdapter;
    ArrayList<Item_myclub> list_clubs;

    ImageView club_logo;

    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_main);
        setBottomView();

        //rounding img
        club_logo = findViewById(R.id.club_logo);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            GradientDrawable drawable= (GradientDrawable)getApplication().getDrawable(R.drawable.square_round);
            club_logo.setBackground(drawable);
            club_logo.setClipToOutline(true);
        }


    }

    public void setBottomView(){

        list_clubs = new ArrayList<>();

        //test2
        list_clubs.add(new Item_myclub("release", R.drawable.ic_launcher_foreground));
        list_clubs.add(new Item_myclub("solgit", R.drawable.ic_launcher_foreground));
        list_clubs.add(new Item_myclub("InaJJang",R.drawable.ic_launcher_foreground));
        list_clubs.add(new Item_myclub("release", R.drawable.ic_launcher_foreground));
        list_clubs.add(new Item_myclub("solgit", R.drawable.ic_launcher_foreground));
        list_clubs.add(new Item_myclub("InaJJang",R.drawable.ic_launcher_foreground));
        list_clubs.add(new Item_myclub("Arii",R.drawable.add_bt));

        recyclerViewBottom= findViewById(R.id.rv_bottom);
        clubsLayoutManager = new LinearLayoutManager(this);
        clubsLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        clubsViewAdapter = new ClubsViewAdapter(list_clubs);

        recyclerViewBottom.setLayoutManager(clubsLayoutManager);
        recyclerViewBottom.setAdapter(clubsViewAdapter);
    }

}
