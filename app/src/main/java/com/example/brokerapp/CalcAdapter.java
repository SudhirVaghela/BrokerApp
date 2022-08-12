package com.example.brokerapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CalcAdapter extends FragmentPagerAdapter {

    int selected_Tab;

    public CalcAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);

        selected_Tab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new GinningFragment();
            case 1 : return new SpinningFragment();
            case 2 : return new ExportsFragment();
            default : return null;

        }
    }

    @Override
    public int getCount() {
        return selected_Tab;
    }
}
