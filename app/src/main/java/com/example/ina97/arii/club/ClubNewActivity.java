package com.example.ina97.arii.club;

import android.os.Bundle;
import android.widget.Button;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.R;

public class ClubNewActivity extends BaseActivity {
    Button bt_join;
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_new);

        bt_join = findViewById(R.id.bt_join);
    }


}
