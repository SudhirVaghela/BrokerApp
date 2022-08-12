package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;

public class FullscreenImage extends AppCompatActivity {

    ImageView backarrow;
    ZoomageView iv_fullscreen;
    int img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_image);
        iv_fullscreen = findViewById(R.id.myZoomageView);
        backarrow = findViewById(R.id.backarrow);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            img = bundle.getInt("image");
            iv_fullscreen.setImageResource(img);
        }
    }
}