package com.example.ina97.arii.Club;

import android.app.ActionBar;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ina97.arii.Adapters.BottomViewAdapter;
import com.example.ina97.arii.Adapters.ClubBodyAdapter;
import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Items.Item_club_body;
import com.example.ina97.arii.Items.Item_myclub;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class ClubMainActivity extends BaseActivity {

    LinearLayoutManager clubsLayoutManager, clubBodyLayoutManager;
    RecyclerView recyclerViewBottom, recyclerViewBody;
    ClubBodyAdapter clubBodyAdapter;

    BottomViewAdapter bottomViewAdapter;
    ArrayList<Item_myclub> list_clubs;
    ArrayList<Item_club_body> list_body;

    ImageView club_logo;

    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_main);

        setBodyView();
        setBottomView();

        //rounding img
        club_logo = findViewById(R.id.club_logo);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            GradientDrawable drawable= (GradientDrawable)getApplication().getDrawable(R.drawable.square_round);
            club_logo.setBackground(drawable);
            club_logo.setClipToOutline(true);
        }


    }

    public void setBodyView(){
        list_body=new ArrayList<>();

        list_body.add(new Item_club_body("8.12", "Release Day","멋지죠 릴리즈 데이 오늘이었다"));
        list_body.add(new Item_club_body("8.13", "Tomorrow","내일은 월욜이고 지웅이를 본다"));
        list_body.add(new Item_club_body("8.15", "광복절","쉬는날이지만 난 맨날 쉰다"));
        list_body.add(new Item_club_body("8.19", "인아 할아버지랑 밥","고기를 먹어야지!"));
        list_body.add(new Item_club_body("8.27", "강릉여행","오호로 신난당!!"));

        recyclerViewBody = findViewById(R.id.rv_body);
        clubBodyLayoutManager= new LinearLayoutManager(this);
        clubBodyLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        clubBodyAdapter = new ClubBodyAdapter(list_body);

        recyclerViewBody.setLayoutManager(clubBodyLayoutManager);
        recyclerViewBody.setAdapter(clubBodyAdapter);
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
        bottomViewAdapter = new BottomViewAdapter(list_clubs);

        recyclerViewBottom.setLayoutManager(clubsLayoutManager);
        recyclerViewBottom.setAdapter(bottomViewAdapter);
    }

}
