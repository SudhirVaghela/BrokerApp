package com.example.brokerapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class NewsFullScreen extends AppCompatActivity {

    TextView tv_newsdesc;
    String news;
    int img;

    ImageView iv_newsimg, backarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_full_screen);
        backarrow = findViewById(R.id.backarrow);
        iv_newsimg = findViewById(R.id.iv_newsimg);
        tv_newsdesc = findViewById(R.id.tv_news_desc);
        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        news = intent.getStringExtra("news");
        tv_newsdesc.setText(news);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            img = bundle.getInt("image");
            iv_newsimg.setImageResource(img);
        }

        iv_newsimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsFullScreen.this, FullscreenImage.class);
                intent.putExtra("image", img);
                startActivity(intent);

            }
        });
    }
}