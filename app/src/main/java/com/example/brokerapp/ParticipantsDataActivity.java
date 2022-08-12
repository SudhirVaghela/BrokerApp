package com.example.brokerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ParticipantsDataActivity extends AppCompatActivity {

    ImageView backarrow;
    RecyclerView dataRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participants_data);
        backarrow = findViewById(R.id.backarrow);
        dataRecycler = findViewById(R.id.dataRecycler);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }


        });

        setParticipantsAdapter();
    }

    private void setParticipantsAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(ParticipantsDataActivity.this, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        ParticipantsDataAdapter adapter = new ParticipantsDataAdapter(ParticipantsDataActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ParticipantsDataActivity.this);
        dataRecycler.addItemDecoration(divider);
        dataRecycler.addItemDecoration(new DividerItemDecoration(ParticipantsDataActivity.this, DividerItemDecoration.VERTICAL));
        dataRecycler.setLayoutManager(layoutManager);
        dataRecycler.setAdapter(adapter);
    }
}