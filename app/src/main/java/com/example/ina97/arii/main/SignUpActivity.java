package com.example.ina97.arii.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ina97.arii.BaseActivity;
import com.example.ina97.arii.R;

public class SignUpActivity extends BaseActivity {
    EditText et_id, et_email, et_password, et_univ;
    Button bt_join;

    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_join);

        et_id= findViewById(R.id.et_id);
        et_email = findViewById(R.id.et_email);
        et_password= findViewById(R.id.et_password);
        bt_join = findViewById(R.id.bt_join);


        //Login page
        bt_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}
