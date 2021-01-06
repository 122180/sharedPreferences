package com.example.sharedprefern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logouts extends AppCompatActivity {
   private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logouts);
        logout=findViewById(R.id.Logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new User(Logouts.this).removeUser();
                startActivity(new Intent(Logouts.this,MainActivity.class));
                 finish();
            }
        });


    }
}