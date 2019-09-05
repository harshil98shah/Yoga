package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    TextView username,password,register,log;
    EditText user,pass;
    Button login;
    ImageView back,back1,logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        username=(TextView)findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);
        user=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.pass);
        register=(TextView)findViewById(R.id.register);
        back=(ImageView)findViewById(R.id.back);
        back1=(ImageView)findViewById(R.id.back1);
        logo=(ImageView)findViewById(R.id.logo);
        log=(TextView)findViewById(R.id.log);
    }

    public void login1(View view) {
        String user1=user.getText().toString();
        String pass1=pass.getText().toString();

        if (user1.equals("gls") && pass1.equals("gls123"))
        {
            startActivity(new Intent(Login_Activity.this,MainActivity.class));

        }
        else {
            Toast.makeText(Login_Activity.this, "Try different Combination", Toast.LENGTH_SHORT).show();
        }
    }

    public void register1(View view) {
        startActivity(new Intent(Login_Activity.this,Registration.class));
    }
}
