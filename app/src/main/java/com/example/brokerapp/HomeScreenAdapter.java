package com.example.brokerapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeScreenAdapter extends FragmentPagerAdapter {

    int selectedTab;
    Context context;


    public HomeScreenAdapter(@NonNull FragmentManager fm, int selectedTab, Context context) {
        super(fm);
        this.selectedTab = selectedTab;
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new NegotiationFragment();
            case 1:
                return new UnreadFragment();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return selectedTab;
    }
}
