package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView backarrow;
    ArrayList<NewsModel> newsdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        backarrow = findViewById(R.id.backarrow);
        recyclerView = findViewById(R.id.recyclerview);
        newsdata = new ArrayList<>();
        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        setSellerinfo();
        setAddapter();
    }

    private void setAddapter() {

        newsdata.add(new NewsModel("Global warming is a hike in the average global temperature on earth.", "2h ago", R.drawable.england));
        newsdata.add(new NewsModel("this is the shortnews lines for daily updates", "2h ago", R.drawable.england));
        newsdata.add(new NewsModel("this is the shortnews lines for daily updates", "2h ago", R.drawable.gw3));
    }

    private void setSellerinfo() {
        NewsAdapter adapter = new NewsAdapter(NewsActivity.this,newsdata);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}