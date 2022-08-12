package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.brokerapp.databinding.ActivityMyClientsBinding;
import com.google.android.material.tabs.TabLayout;


public class MyClientsActivity extends AppCompatActivity {

    ActivityMyClientsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyClientsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("All"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Buyers"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Sellers"));


        binding.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        ClientAdapter adapter = new ClientAdapter(MyClientsActivity.this, getSupportFragmentManager(),binding.tabLayout.getTabCount());
        binding.tabViewPager.setAdapter(adapter);
        binding.tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.tabViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}