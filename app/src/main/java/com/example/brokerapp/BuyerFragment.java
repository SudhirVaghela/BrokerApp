package com.example.brokerapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BuyerFragment extends Fragment {

    RecyclerView my_buyer_rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_buyer,container,false);

        my_buyer_rv = view.findViewById(R.id.my_buyer_rv);

        setClientsAdapter();



        return view;
    }
    private void setClientsAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));


        AllClientsTabAdapter adapter = new AllClientsTabAdapter(getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        my_buyer_rv.addItemDecoration(divider);
        my_buyer_rv.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        my_buyer_rv.setLayoutManager(layoutManager);
        my_buyer_rv.setAdapter(adapter);
    }
}