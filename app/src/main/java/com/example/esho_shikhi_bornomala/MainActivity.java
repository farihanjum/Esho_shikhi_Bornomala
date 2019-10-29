package com.example.esho_shikhi_bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    MediaPlayer backGround;
    private static int SPLASH_TIME_OUT = 2500;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            backGround = MediaPlayer.create(this, R.raw.music);
          backGround.start();




       /* backGround.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                backGround.start();
            }

        });

        backGround.start();*/



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
