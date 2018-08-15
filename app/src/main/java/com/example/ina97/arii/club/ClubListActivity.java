package com.example.ina97.arii.club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.R;
import com.example.ina97.arii.main.MainActivity;

public class ClubListActivity extends BaseActivity{
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);setContentView(R.layout.main_search);

        setContentView(R.layout.club_list);
        TextView tv = findViewById(R.id.tv);
        tv.setText("ClubListPage");
        bt_next= findViewById(R.id.bt_next);
        bt_prev = findViewById(R.id.bt_prev);

        bt_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        bt_next.setText("Club Main page");
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ClubListActivity.this, ClubMainActivity.class);
                startActivity(intent);
            }
        });

    }


}
