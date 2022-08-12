package com.example.brokerapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class UnreadFragment extends Fragment {

    RecyclerView unreadRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_unread,container,false);

        unreadRecycler = view.findViewById(R.id.unreadRecycler);

        setHomeAdapter();
        return view;
    }

    private void setHomeAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        HomeTabsAdapter adapter = new HomeTabsAdapter(getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        unreadRecycler.addItemDecoration(divider);
        unreadRecycler.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        unreadRecycler.setLayoutManager(layoutManager);
        unreadRecycler.setAdapter(adapter);

    }
}