package com.example.ina97.arii.Main;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.ina97.arii.Adapters.BottomViewAdapter;
import com.example.ina97.arii.Adapters.NewsViewAdapter;
import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Items.Item_club_news;
import com.example.ina97.arii.Items.Item_myclub;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class MainActivity extends BaseActivity{

    LinearLayoutManager newsLayoutManager, clubsLayoutManager;
    NewsViewAdapter newsViewAdapter;
    BottomViewAdapter bottomViewAdapter;
    RecyclerView recyclerViewBody, recyclerViewBottom;
    ArrayList <Item_club_news> list_news;
    ArrayList <Item_myclub> list_clubs;
;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode( ActionBar.NAVIGATION_MODE_TABS );

        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);			//액션바 아이콘을 업 네비게이션 형태로 표시합니다.
        actionBar.setDisplayShowTitleEnabled(false);		//액션바에 표시되는 제목의 표시유무를 설정합니다.
        actionBar.setDisplayShowHomeEnabled(false);			//홈 아이콘을 숨김처리합니다.

        View mCustomView = LayoutInflater.from(this).inflate(R.layout.actionbar, null);
        actionBar.setCustomView(mCustomView);

        setBodyView();
        setBottomView();

    }


    public void setBodyView(){
        list_news = new ArrayList<>();
        //test
        list_news.add(new Item_club_news("Release 학회원 모집!", "정말 좋다! 너무 너무 릴리즈 우주 짱짱\n난 이미 릴리즈! 펭귄이 까매" ));
        list_news.add(new Item_club_news("솔깃 공연 한다!", "궁금하다 가고싶다 룰루 멋져\n난 이미 솔깃!!" ));

        recyclerViewBody = findViewById(R.id.rv_body);
        newsLayoutManager = new LinearLayoutManager(this);
        newsLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        newsViewAdapter = new NewsViewAdapter(list_news);

        recyclerViewBody.setLayoutManager(newsLayoutManager);
        recyclerViewBody.setAdapter(newsViewAdapter);
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
