package com.example.sharedprefern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class SplassScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_splass_screen);
        Timer timer=new Timer();
        String string=new User(SplassScreen.this).getName();
        Log.d("name",string);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               if(new User(SplassScreen.this).getName().equals("")) {
                   startActivity(new Intent(SplassScreen.this, MainActivity.class));
                   finish();


               }else
               {
                   startActivity(new Intent(SplassScreen.this, Logouts.class));
                   finish();
               }

            }
        },2000);

    }
}