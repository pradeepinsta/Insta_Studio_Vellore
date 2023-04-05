package com.example.instastudiovellore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;


public class Signup extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //No Dark mode for whole App
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        setContentView(R.layout.activity_signup);

        //No dark mode for this activity
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }


}