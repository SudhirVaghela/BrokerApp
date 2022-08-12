package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.brokerapp.databinding.ActivityMyEarningsBinding;

public class MyEarningsActivity extends AppCompatActivity {

    ActivityMyEarningsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_earnings);

        binding = ActivityMyEarningsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setEarningAdapter();

    }

    private void setEarningAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(MyEarningsActivity.this, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        MyEarningAdapter adapter = new MyEarningAdapter(MyEarningsActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MyEarningsActivity.this);
        binding.earningRv.addItemDecoration(divider);
        binding.earningRv.addItemDecoration(new DividerItemDecoration(MyEarningsActivity.this, DividerItemDecoration.VERTICAL));
        binding.earningRv.setLayoutManager(layoutManager);
        binding.earningRv.setAdapter(adapter);

    }
}