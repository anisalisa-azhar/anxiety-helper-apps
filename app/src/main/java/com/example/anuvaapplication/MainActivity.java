package com.example.anuvaapplication;

import android.os.Bundle;
import android.view.animation.LinearInterpolator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

public class MainActivity extends AppCompatActivity {

    LazyLoader lazyLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lazyLoader = (LazyLoader)findViewById(R.id.myLoader);

        LazyLoader loader = new LazyLoader(this, 30, 20, ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected));
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());

       lazyLoader.addView(loader);
    }
}