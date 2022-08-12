package com.example.brokerapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class MyWorkFragment extends Fragment {

    RelativeLayout rl_reports, rl_myclient, rl_mycontract, rl_myprofile, rl_myrequest, rl_changepass, rl_myearning,
             rl_logout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_my_work,container,false);

        rl_reports = view.findViewById(R.id.rl_reports);
        rl_myclient = view.findViewById(R.id.rl_myclient);
        rl_mycontract = view.findViewById(R.id.rl_mycontract);
        rl_myprofile = view.findViewById(R.id.rl_myprofile);
        rl_myrequest = view.findViewById(R.id.rl_myrequest);
        rl_changepass = view.findViewById(R.id.rl_changepass);
        rl_myearning = view.findViewById(R.id.rl_myearning);

        rl_logout = view.findViewById(R.id.rl_logout);

        rl_reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ReportActivity.class));
            }
        });
        rl_myclient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MyClientsActivity.class));
            }
        });
        rl_changepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ChangePasswordActivity.class));
            }
        });
        rl_myrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MyRequestsActivity.class));
            }
        });
        rl_myearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MyEarningsActivity.class));
            }
        });
        rl_myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MyProfileActivity.class));
            }
        });
        rl_mycontract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MyContractActivity.class));
            }
        });



        return  view;
    }
}