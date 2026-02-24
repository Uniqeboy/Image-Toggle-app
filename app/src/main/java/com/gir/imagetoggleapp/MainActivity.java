package com.gir.imagetoggleapp;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    boolean isModiShowing = true;   // Initially Modi is visible

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        imageView.setOnClickListener(v -> {

            // Delay of 2 seconds (2000 milliseconds)
            new Handler().postDelayed(() -> {

                if (isModiShowing) {
                    imageView.setImageResource(R.drawable.rahul);
                    isModiShowing = false;
                } else {
                    imageView.setImageResource(R.drawable.modi);
                    isModiShowing = true;
                }

            }, 2000);

        });
    }
}