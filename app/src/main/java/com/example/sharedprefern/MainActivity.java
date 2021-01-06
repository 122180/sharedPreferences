package com.example.sharedprefern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name,pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        pass=findViewById(R.id.password);
        login=findViewById(R.id.Login);
         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(name.getText()!=null&& pass.getText()!=null)
                 {
                  User user=new User(MainActivity.this);
                  user.setName(name.getText().toString());
                  user.setPass(pass.getText().toString());
                           String str=Vaildation.vailed(user);
                           if(str.equals("success"))
                           {
                               startActivity(new Intent(MainActivity.this,Logouts.class));
                               finish();
                           }else {
                               Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                           }
                 }else
                 {
                     Toast.makeText(MainActivity.this, "please the form", Toast.LENGTH_SHORT).show();
                 }
             }
         });
    }
}