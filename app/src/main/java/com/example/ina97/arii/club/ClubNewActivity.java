package com.example.ina97.arii.club;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.R;
import com.example.ina97.arii.main.MainActivity;

public class ClubNewActivity extends BaseActivity {
    Button bt_join;
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_new);

        bt_join = findViewById(R.id.bt_join);
    }


}
