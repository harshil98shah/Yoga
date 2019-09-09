package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class BeginnerYoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String yoga = getIntent().getStringExtra("yoga");
        if(yoga.equalsIgnoreCase("beginner"))
        {
            setContentView(R.layout.activity_beginner_yoga);
        }
        else if(yoga.equalsIgnoreCase("morning"))
        {
            setContentView(R.layout.activity_beginner_yoga);
        }
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle(yoga);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.colorBlue));

    }
}
