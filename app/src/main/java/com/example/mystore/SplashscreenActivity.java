package com.example.mystore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class SplashscreenActivity extends AppCompatActivity {
    private String TAG= SplashscreenActivity.class.getSimpleName();
    private int TIME_OUT = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent( SplashscreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME_OUT);


    }
}

