package com.example.nlpc06.sharedpreference;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by NL PC 06 on 10/23/2017.
 */

public class BaseActivity extends AppCompatActivity {

    private MyPref myPref;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myPref = new MyPref(getApplicationContext());
    }

    public MyPref getMyPref(){
        return myPref;
    }
}
