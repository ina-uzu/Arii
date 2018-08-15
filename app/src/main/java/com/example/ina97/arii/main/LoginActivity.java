package com.example.ina97.arii.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ina97.arii.BaseActivity;;
import com.example.ina97.arii.R;
import com.example.ina97.arii.club.ClubMainActivity;

public class LoginActivity extends BaseActivity {
    TextView tv_title, tv_findPassword, tv_join;
    Button bt_login;
    EditText et_id, et_password;

    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_login);


        tv_title = findViewById(R.id.tv_title);
        tv_join = findViewById(R.id.join);
        tv_findPassword = findViewById(R.id.findPassword);
        et_id = findViewById(R.id.et_id);
        et_password = findViewById(R.id.et_password);
        bt_login = findViewById(R.id.bt_login);

        String id = et_id.getText().toString();
        String password = et_password.getText().toString();


        tv_findPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tv_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
  }
}
