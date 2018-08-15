package com.example.ina97.arii.club;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.example.ina97.arii.adapters.BottomViewAdapter;
import com.example.ina97.arii.adapters.ClubBodyAdapter;
import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Items.ItemClubBody;
import com.example.ina97.arii.Items.ItemMyclub;
import com.example.ina97.arii.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ClubMainActivity extends BaseActivity {

    LinearLayoutManager clubsLayoutManager, clubBodyLayoutManager;
    RecyclerView recyclerViewBottom, recyclerViewBody;
    ClubBodyAdapter clubBodyAdapter;

    BottomViewAdapter bottomViewAdapter;
    ArrayList<ItemMyclub> list_clubs;
    ArrayList<ItemClubBody> list_body;

    ImageView club_logo;
    ImageView main_img;
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_main);

        main_img = findViewById(R.id.main_img);
        Picasso.with(this).load(R.drawable.release_main).into(main_img);

        setBodyView();
        setBottomView();

        //rounding img
        club_logo = findViewById(R.id.club_logo);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            GradientDrawable drawable= (GradientDrawable)getApplication().getDrawable(R.drawable.square_round);
            club_logo.setBackground(drawable);
            club_logo.setClipToOutline(true);
        }
        Picasso.with(this).load(R.drawable.release_logo).into(club_logo);


    }

    public void setBodyView(){
        list_body=new ArrayList<>();

        list_body.add(new ItemClubBody("8.12", "Release Day","멋지죠 릴리즈 데이 오늘이었다"));
        list_body.add(new ItemClubBody("8.13", "Tomorrow","내일은 월욜이고 지웅이를 본다"));
        list_body.add(new ItemClubBody("8.15", "광복절","쉬는날이지만 난 맨날 쉰다"));
        list_body.add(new ItemClubBody("8.19", "인아 할아버지랑 밥","고기를 먹어야지!"));
        list_body.add(new ItemClubBody("8.27", "강릉여행","오호로 신난당!!"));

        recyclerViewBody = findViewById(R.id.rv_club_member);
        clubBodyLayoutManager= new LinearLayoutManager(this);
        clubBodyLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        clubBodyAdapter = new ClubBodyAdapter(list_body);

        recyclerViewBody.setLayoutManager(clubBodyLayoutManager);
        recyclerViewBody.setAdapter(clubBodyAdapter);
    }
    public void setBottomView(){

        list_clubs = new ArrayList<>();

        //test2
        list_clubs.add(new ItemMyclub("release", R.drawable.ic_launcher_foreground));
        list_clubs.add(new ItemMyclub("solgit", R.drawable.ic_launcher_foreground));
        list_clubs.add(new ItemMyclub("InaJJang",R.drawable.ic_launcher_foreground));
        list_clubs.add(new ItemMyclub("release", R.drawable.ic_launcher_foreground));
        list_clubs.add(new ItemMyclub("solgit", R.drawable.ic_launcher_foreground));
        list_clubs.add(new ItemMyclub("InaJJang",R.drawable.ic_launcher_foreground));
        list_clubs.add(new ItemMyclub("Arii",R.drawable.add_bt));

        recyclerViewBottom= findViewById(R.id.rv_bottom);
        clubsLayoutManager = new LinearLayoutManager(this);
        clubsLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        bottomViewAdapter = new BottomViewAdapter(list_clubs);

        recyclerViewBottom.setLayoutManager(clubsLayoutManager);
        recyclerViewBottom.setAdapter(bottomViewAdapter);
    }

}
