package com.example.ina97.arii;

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

import java.util.ArrayList;

public class TestActivity extends Activity {

    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;
    RecyclerViewAdapter viewAdapter;
    ArrayList <Item_club_news> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        list = new ArrayList<>();
        list.add(new Item_club_news("제목1", "인아는 멋져"));
        list.add(new Item_club_news( "제목2", "인아는 에뻐"));
        list.add(new Item_club_news("제목3", "이제 그만 적어야지!"));

        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        viewAdapter = new RecyclerViewAdapter(list);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(viewAdapter);
    }

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerVIewHolder> {
        private ArrayList<Item_club_news> mList;
        Context mContext;
        public RecyclerViewAdapter(ArrayList list){
            mList= list;
        }

        @NonNull
        @Override
        public RecyclerVIewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club_news,viewGroup,false);

            mContext=viewGroup.getContext();
            RecyclerVIewHolder holder =new RecyclerVIewHolder(v);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerVIewHolder holder, final int position) {
            holder.tv_title.setText(mList.get(position).title);
            holder.tv_cont.setText(mList.get(position).cont);

            holder.itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, String.valueOf(position+1)+"선택", Toast.LENGTH_SHORT).show();
                }

            });
        }
        public int getItemCount(){
            return mList.size();

        }
    }

    private class RecyclerVIewHolder extends RecyclerView.ViewHolder {
        public TextView tv_title;
        public TextView tv_cont;

        public RecyclerVIewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title  = itemView.findViewById(R.id.title);
            tv_cont = itemView.findViewById(R.id.cont);
        }
    }
}
