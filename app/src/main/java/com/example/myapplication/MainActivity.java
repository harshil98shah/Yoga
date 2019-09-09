package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        final WorkoutFragment workoutFragment = new WorkoutFragment();
        final ExerciseFragment exerciseFragment = new ExerciseFragment();
        final SettingFragment settingFragment = new SettingFragment();

       navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

               int id = menuItem.getItemId();
               if (id == R.id.workout)
               {
                   setFragment(workoutFragment);
                   return true;
               }
               else if(id == R.id.exercise)
               {
                   setFragment(exerciseFragment);
                   return true;
               }
               else if (id == R.id.setting)
               {
                   setFragment(settingFragment);
                   return true;
               }
               return false;
           }
       });

       navigationView.setSelectedItemId(R.id.workout);

    }
    private void setFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }


    public void go(View view) {
        startActivity(new Intent(MainActivity.this,BeginnerYoga.class).putExtra("yoga","beginner"));
    }
    public void goToMorning(View view) {
        startActivity(new Intent(MainActivity.this,BeginnerYoga.class).putExtra("yoga","morning"));
    }

}
