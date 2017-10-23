package com.example.nlpc06.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvName,tvAge,tvMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();

        MyPref myPref = new MyPref(getApplicationContext());

        tvName.setText(myPref.getName());
        tvAge.setText(String.valueOf(myPref.getAge()));
        tvMail.setText(myPref.getEmail());



    }

    private void initView() {
        tvName = (TextView) findViewById(R.id.name);
        tvAge = (TextView) findViewById(R.id.age);
        tvMail = (TextView) findViewById(R.id.mail);
    }
}
