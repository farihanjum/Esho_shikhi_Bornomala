package com.example.esho_shikhi_bornomala;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2500;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash  =new Intent(MainActivity.this, contentActivity.class);
                startActivity(splash);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
