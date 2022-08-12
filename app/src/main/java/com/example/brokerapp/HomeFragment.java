package com.example.brokerapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.brokerapp.databinding.FragmentAllBinding;
import com.example.brokerapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {


    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(getLayoutInflater());

        setEarningAdapter();

        return binding.getRoot();
    }

    private void setEarningAdapter() {

        DividerItemDecoration divider = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        MyEarningAdapter adapter = new MyEarningAdapter(getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        binding.earningRv.addItemDecoration(divider);
        binding.earningRv.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        binding.earningRv.setLayoutManager(layoutManager);
        binding.earningRv.setAdapter(adapter);

    }
}