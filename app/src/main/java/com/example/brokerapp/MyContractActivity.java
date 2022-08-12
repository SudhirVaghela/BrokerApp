package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.brokerapp.databinding.ActivityMyContractBinding;

public class MyContractActivity extends AppCompatActivity {

    ActivityMyContractBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contract);

        binding = ActivityMyContractBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setContractAdapter();

        binding.icFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyContractActivity.this,MyContractFilteractivity.class));
            }
        });



    }
    private void setContractAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(MyContractActivity.this, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));


        MyContractAdapter adapter = new MyContractAdapter(MyContractActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MyContractActivity.this);
        binding.contractRecyclerview.addItemDecoration(divider);
        binding.contractRecyclerview.addItemDecoration(new DividerItemDecoration(MyContractActivity.this,DividerItemDecoration.VERTICAL));
        binding.contractRecyclerview.setLayoutManager(layoutManager);
        binding.contractRecyclerview.setAdapter(adapter);

    }
}