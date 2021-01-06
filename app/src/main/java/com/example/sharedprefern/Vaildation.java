package com.example.sharedprefern;

import android.content.Context;

public class Vaildation {
    private Context mContext;


    public Vaildation(Context context) {
        mContext = context;

    }

    public static String vailed(User mUser)
    {
       if(mUser.getName().equals("admin")&&mUser.getPass().equals("admin"))
       {
           return "success";
       }
        else
       {
           return "failed";
       }
    }
}
