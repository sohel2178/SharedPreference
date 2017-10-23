package com.example.nlpc06.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by NL PC 06 on 10/23/2017.
 */

public class MyPref {

    private static final String SP_NAME="SSSPPP";
    private static final String NAME="name";
    private static final String AGE="age";
    private static final String EMAIL="email";
    private static final String LOGIN="LOGIN";

    private Context context;

    SharedPreferences sp;

    public MyPref(Context context) {
        this.context = context;

        sp = context.getSharedPreferences(SP_NAME,context.MODE_PRIVATE);

    }

    public void setName(String name){
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(NAME,name);
        editor.apply();
    }

    public String getName(){
        String name = sp.getString(NAME,"");
        return name;
    }

    public void setAge(int age){
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(AGE,age);
        editor.apply();
    }

    public int getAge(){
        int age = sp.getInt(AGE,0);
        return age;
    }
    public void setEmail(String email) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(EMAIL, email);
        editor.apply();
    }

    public String getEmail(){
        return sp.getString(EMAIL,"");
    }

    public void setLogin(boolean value){
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(LOGIN,value);
        editor.apply();
    }

    public boolean isLogin(){
        return sp.getBoolean(LOGIN,false);
    }


}
