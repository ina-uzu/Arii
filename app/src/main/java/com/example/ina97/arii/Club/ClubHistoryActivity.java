package com.example.ina97.arii.Club;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Main.MainActivity;
import com.example.ina97.arii.Main.MainSearchActivity;
import com.example.ina97.arii.R;

public class ClubHistoryActivity extends BaseActivity {
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_history);

        TextView tv = findViewById(R.id.tv);
        tv.setText("ClubHistoryPage");

        bt_next= findViewById(R.id.bt_next);
        bt_prev = findViewById(R.id.bt_prev);

        bt_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubHistoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubHistoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
