package com.example.nlpc06.sharedpreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private EditText etName,etAge,etmail;
    private Button btnSave,btnSecondActivity,btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(!getMyPref().isLogin()){
            gotoLoginActivity();
            finish();
        }

        initView();
    }

    private void gotoLoginActivity() {
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }

    private void initView() {
        etName = (EditText) findViewById(R.id.name);
        etAge = (EditText) findViewById(R.id.age);
        etmail = (EditText) findViewById(R.id.mail);


        btnSave = (Button) findViewById(R.id.btn_save);
        btnSecondActivity = (Button) findViewById(R.id.btn_second_activity);
        btnLogout = (Button) findViewById(R.id.btn_log_out);

        btnSave.setOnClickListener(this);
        btnSecondActivity.setOnClickListener(this);
        btnLogout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_save:
                saveData();
                break;

            case R.id.btn_second_activity:
                gotoSecondActivity();
                break;

            case R.id.btn_log_out:
                getMyPref().setLogin(false);
                break;
        }
    }

    // Save Name and age into Shared Preference
    private void saveData() {
        String name = etName.getText().toString();
        String ageStr = etAge.getText().toString();
        String mail = etmail.getText().toString();

        int age =0;

        if(!ageStr.equals("")){
            age = Integer.parseInt(ageStr);
        }



        // Save name and age into shared Preference

        if(!name.equals("")){
            getMyPref().setName(name);
        }

        if(!mail.equals("")){
            getMyPref().setEmail(mail);
        }



        getMyPref().setAge(age);


    }

    private void gotoSecondActivity(){

        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);

    }
}
