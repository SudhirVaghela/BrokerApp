package com.example.brokerapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    HomeFragment homeFragment;
    RelativeLayout btmView_rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btmView_rl = findViewById(R.id.btmView_rl);

        homeFragment = new HomeFragment();

        replaceFragment(homeFragment);



        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigation.setSelectedItemId(R.id.Home);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.Home:

                        replaceFragment(homeFragment);
                        btmView_rl.setBackgroundColor(getResources().getColor(R.color.white));
                        break;
                    case R.id.utilities:
                        UtilitiesFragment utilitiesFragment = new UtilitiesFragment();
                        replaceFragment(utilitiesFragment);
                        btmView_rl.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        break;
                    case R.id.mywork:
                        MyWorkFragment myWorkFragment = new MyWorkFragment();
                        replaceFragment(myWorkFragment);
                        btmView_rl.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        break;
                }

                return true;
            }
        });
    }
    public void replaceFragment(Fragment fragment) {

        try {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameContainer, fragment);
            fragmentTransaction.commit();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}