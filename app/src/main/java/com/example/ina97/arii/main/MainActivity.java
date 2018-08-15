package com.example.ina97.arii.main;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Items.ItemClubNews;
import com.example.ina97.arii.Items.ItemMyclub;
import com.example.ina97.arii.R;
import com.example.ina97.arii.adapters.BottomViewAdapter;
import com.example.ina97.arii.adapters.NewsViewAdapter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity{

    LinearLayoutManager newsLayoutManager, clubsLayoutManager;
    NewsViewAdapter newsViewAdapter;
    BottomViewAdapter bottomViewAdapter;
    RecyclerView recyclerViewBody, recyclerViewBottom;
    ArrayList <ItemClubNews> list_news;
    ArrayList <ItemMyclub> list_clubs;
;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        setBodyView();
        setBottomView();

    }


    public void setBodyView(){
        list_news = new ArrayList<>();
        //test
        list_news.add(new ItemClubNews("Release 학회원 모집!", "정말 좋다! 너무 너무 릴리즈 우주 짱짱\n난 이미 릴리즈! 펭귄이 까매" ));
        list_news.add(new ItemClubNews("솔깃 공연 한다!", "궁금하다 가고싶다 룰루 멋져\n난 이미 솔깃!!" ));

        recyclerViewBody = findViewById(R.id.rv_club_member);
        newsLayoutManager = new LinearLayoutManager(this);
        newsLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        newsViewAdapter = new NewsViewAdapter(list_news);

        recyclerViewBody.setLayoutManager(newsLayoutManager);
        recyclerViewBody.setAdapter(newsViewAdapter);
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
