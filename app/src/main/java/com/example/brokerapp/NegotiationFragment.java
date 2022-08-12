package com.example.brokerapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NegotiationFragment extends Fragment {

    RecyclerView negotiationRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_negotiation,container,false);
        negotiationRecycler = view.findViewById(R.id.negotiationRecycler);

        setHomeAdapter();


        return view;
    }

    private void setHomeAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        HomeTabsAdapter adapter = new HomeTabsAdapter(getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        negotiationRecycler.addItemDecoration(divider);
        negotiationRecycler.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        negotiationRecycler.setLayoutManager(layoutManager);
        negotiationRecycler.setAdapter(adapter);

    }
}