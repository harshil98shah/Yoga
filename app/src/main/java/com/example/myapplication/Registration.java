package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    TextView username,password,emailid,login,log;
    EditText user,pass,email;
    Button register;
    ImageView back,back1,logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        username=(TextView)findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);
        emailid=(TextView)findViewById(R.id.emailid);
        login=(TextView)findViewById(R.id.login);
        user=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.pass);
        email=(EditText)findViewById(R.id.email);
        register=(Button)findViewById(R.id.register);
        back=(ImageView)findViewById(R.id.back);
        back1=(ImageView)findViewById(R.id.back1);
        logo=(ImageView)findViewById(R.id.logo);
        log=(TextView)findViewById(R.id.log);
    }

    public void login1(View view) {
       startActivity(new Intent(Registration.this,Login_Activity.class));
    }
}
