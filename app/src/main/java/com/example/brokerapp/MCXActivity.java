package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MCXActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageView backarrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcxactivity);
        recyclerView = findViewById(R.id.mcxrecyclerview);
        backarrow = findViewById(R.id.backarrow);

        setMcxAdapter();

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void setMcxAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(MCXActivity.this,
                        DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));


        MCXAdapter adapter = new MCXAdapter(MCXActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(divider);
        recyclerView.addItemDecoration(new DividerItemDecoration(MCXActivity.this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}