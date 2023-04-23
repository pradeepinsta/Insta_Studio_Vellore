package com.example.instastudiovellore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.instastudiovellore.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView mBottomNavigationView;
    HomeFragment mHomeFragment;
    PortfolioFragment mPortfolioFragment;
    BookingFragment mBookingFragment;
    SettingFragment mSettingFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        setFragment(new HomeFragment());
        FirebaseApp.initializeApp(this);

        mHomeFragment = new HomeFragment();
        mPortfolioFragment = new PortfolioFragment();
        mBookingFragment = new BookingFragment();
        mSettingFragment = new SettingFragment();

        mBottomNavigationView = findViewById(R.id.bottomNavigationView);

        mBottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        setFragment(new HomeFragment());
                        return true;
                    case R.id.portfolio:
                        setFragment(new PortfolioFragment());
                        break;
                    case R.id.booking:
                        setFragment(new BookingFragment());
                        break;
                    case R.id.setting:
                        setFragment(new SettingFragment());
                        break;

                }
                return false;
            }
        });


    }

    private void setFragment (Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}