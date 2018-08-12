package com.example.ina97.arii.Main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.Club.ClubMainActivity;
import com.example.ina97.arii.R;

public class LoginActivity extends BaseActivity {
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_login);

        TextView tv = findViewById(R.id.tv);
        tv.setText("Login Page");
        bt_next= findViewById(R.id.bt_next);
        bt_prev=findViewById(R.id.bt_prev);

        bt_prev.setText("ClubMain");
        bt_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ClubMainActivity.class);
                startActivity(intent);
            }
        });
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
  }
}
