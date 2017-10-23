package com.example.nlpc06.sharedpreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private EditText etName,etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        // This is a new Comment
    }

    private void initView() {
        etName = (EditText) findViewById(R.id.name);
        etPassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
         String name = etName.getText().toString();
        String pass = etPassword.getText().toString();

        if(name.equals("rayhan") && pass.equals("123456")){
            getMyPref().setLogin(true);
            finish();
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }else{
            Toast.makeText(this, "You are not a Valid User", Toast.LENGTH_SHORT).show();
        }
    }
}
