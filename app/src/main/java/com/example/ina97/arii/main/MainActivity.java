package com.example.ina97.arii.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Items.ItemClubNews;
import com.example.ina97.arii.Items.ItemMyclub;
import com.example.ina97.arii.R;
import com.example.ina97.arii.RecyclerItemClickListener;
import com.example.ina97.arii.adapters.BottomViewAdapter;
import com.example.ina97.arii.adapters.NewsViewAdapter;
import com.example.ina97.arii.club.ClubMainActivity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    LinearLayoutManager newsLayoutManager, clubsLayoutManager;
    NewsViewAdapter newsViewAdapter;
    BottomViewAdapter bottomViewAdapter;
    RecyclerView recyclerViewBody, recyclerViewBottom;
    ArrayList <ItemClubNews> list_news;
    ArrayList <ItemMyclub> list_clubs;

    //FAB
    Animation fab_open, fab_close;
    FloatingActionButton fab, fab2, fab3;
    Boolean openFlag = false;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        setBodyView();
        //setBottomView();

        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        fab = findViewById(R.id.fab);
        fab2 = findViewById(R.id.fab2);
        fab3 = findViewById(R.id.fab3);

        //버튼 상태 초기화(닫혀있어라!)
        fab2.startAnimation(fab_close);
        fab3.startAnimation(fab_close);
        fab2.setClickable(false);
        fab3.setClickable(false);

        fab.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);

        recyclerViewBody.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(), recyclerViewBody, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "click", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ClubMainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "long click", Toast.LENGTH_LONG).show();
            }
        }));

    }

    public void anim() {

        if (openFlag) {
            fab2.startAnimation(fab_close);
            fab3.startAnimation(fab_close);
            fab2.setClickable(false);
            fab3.setClickable(false);
            openFlag = false;
        } else {
            fab2.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            fab2.setClickable(true);
            fab3.setClickable(true);
            openFlag = true;
        }
    }

    @Override
    public void onClick(View v){
        int id = v.getId();

        switch (id) {
            case R.id.fab:
                anim();
                break;
            case R.id.fab2:
                anim();
                Toast.makeText(this, "노랑이", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab3:
                anim();
                Toast.makeText(this, "파랑이", Toast.LENGTH_SHORT).show();
                break;
        }


    }
    public void setBodyView(){
        list_news = new ArrayList<>();
        //test
        list_news.add(new ItemClubNews("인아 팬클럽 회원 모집!", "정말 좋다! 너무 너무 인아 우주 짱짱\n난 이미 인아팬! 행복하세요 모두들!" ));
        list_news.add(new ItemClubNews("솔깃 공연 한다!", "궁금하다 가고싶다 룰루 멋져\n난 이미 솔깃!!" ));

        recyclerViewBody = findViewById(R.id.body);
        newsLayoutManager = new LinearLayoutManager(this);
        newsLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
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


