package com.example.ina97.arii.Main;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ina97.arii.Items.Item_club_news;
import com.example.ina97.arii.R;

import java.util.ArrayList;

public class MainActivity extends Activity {

    LinearLayoutManager newsLayoutManager;
    NewsViewAdapter newsViewAdapter;
    RecyclerView recyclerViewBody, recyclerViewBottom;
    ArrayList <Item_club_news> list_news;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_test);

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
    private class NewsViewAdapter extends RecyclerView.Adapter<NewsHolder>{
        private ArrayList <Item_club_news> mlist;
        Context mContext;

        NewsViewAdapter(ArrayList<Item_club_news> list){
            this.mlist=list;
        }

        @NonNull
        @Override
        public NewsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club_news, viewGroup,false);
            mContext=viewGroup.getContext();
            NewsHolder holder = new NewsHolder(v);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull NewsHolder newsHolder, final int i) {
            newsHolder.tv_title.setText(mlist.get(i).getTitle());
            newsHolder.tv_cont.setText(mlist.get(i).getCont());

            newsHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), mlist.get(i).getCont(), Toast.LENGTH_LONG).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return mlist.size();
        }
    }

    private class NewsHolder extends RecyclerView.ViewHolder {
        public TextView tv_title;
        public TextView tv_cont;

        public NewsHolder(@NonNull View itemView) {
            super(itemView);
            tv_title  = itemView.findViewById(R.id.title);
            tv_cont = itemView.findViewById(R.id.cont);
        }


    }
}
