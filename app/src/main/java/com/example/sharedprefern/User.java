package com.example.sharedprefern;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
  private   String name;
    private String Pass;


    Context mContext;
    SharedPreferences mSharedPreferences;

    public User(Context context) {
        mContext = context;
        mSharedPreferences=mContext.getSharedPreferences("login_detail",Context.MODE_PRIVATE);


    }





    public String getPass() {
        Pass=mSharedPreferences.getString("pass","");
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
        mSharedPreferences.edit().putString("pass",Pass).apply();

    }

    public String getName() {
        name=mSharedPreferences.getString("name", "");

        return name;
    }

    public void setName(String name) {
        this.name = name;
        mSharedPreferences.edit().putString("name",name).apply();
    }
    public void removeUser()
    {
        mSharedPreferences.edit().clear();
    }
}
