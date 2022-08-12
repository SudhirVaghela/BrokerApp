package com.example.brokerapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class UtilitiesFragment extends Fragment {

    RelativeLayout rl_mcx, rl_calculator, rl_news;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_utilities, container, false);

        rl_mcx = view.findViewById(R.id.rl_mcx);
        rl_calculator = view.findViewById(R.id.rl_calculator);
        rl_news = view.findViewById(R.id.rl_news);

        rl_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), CalculatorActivity.class));
            }
        });

        rl_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), NewsActivity.class));
            }
        });

        rl_mcx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MCXActivity.class));
            }
        });

        return view;
    }
}