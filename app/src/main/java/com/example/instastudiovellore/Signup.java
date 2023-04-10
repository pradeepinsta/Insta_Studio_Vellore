package com.example.instastudiovellore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Signup extends AppCompatActivity {

    ImageView logo;
    Button phoneSignin;
    Button googleSignin;
    TextView textviewOr,textviewContactUs,textviewQueries;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup);

        logo = findViewById(R.id.imageViewLogo);
        textviewOr = findViewById(R.id.textViewOr);
        textviewContactUs = findViewById(R.id.textViewContactus);
        textviewQueries = findViewById(R.id.textViewQueries);
        phoneSignin = findViewById(R.id.button_phone);
        googleSignin = findViewById(R.id.button_google);

        phoneSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Signup.this,PhoneSignActivity.class);
                startActivity(intent);
                finish();
            }
        });

        textviewContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Signup.this,ContactActivity.class);
                startActivity(intent);
                finish();

            }
        });


    }


}