package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.brokerapp.databinding.ActivityMyRequestsBinding;

public class MyRequestsActivity extends AppCompatActivity {

    ActivityMyRequestsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_requests);

        binding = ActivityMyRequestsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setRequestAdapter();

    }

    private void setRequestAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(MyRequestsActivity.this, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        MyRequestsAdapter adapter = new MyRequestsAdapter(MyRequestsActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MyRequestsActivity.this);
        binding.rvRequestsData.addItemDecoration(divider);
        binding.rvRequestsData.addItemDecoration(new DividerItemDecoration(MyRequestsActivity.this,DividerItemDecoration.VERTICAL));
        binding.rvRequestsData.setLayoutManager(layoutManager);
        binding.rvRequestsData.setAdapter(adapter);
    }
}