package com.example.brokerapp;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ClientAdapter extends FragmentPagerAdapter {

    int selected_Tab;


    public ClientAdapter(MyClientsActivity myClientsActivity, @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        selected_Tab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0: return new AllFragment();
           case 1: return new BuyerFragment();
           case 2: return new SellerFragment();
           default: return null;
       }
    }

    @Override
    public int getCount() {
        return selected_Tab;
    }
}
