package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mw_v1 extends AppCompatActivity {
    private AnimatorSet mSetRightOut;
    private AnimatorSet mSetLeftIn;
    private boolean mIsBackVisible = true;
    private View mCardFrontLayout;
    private View mCardBackLayout;
    private ImageView card_front_image;
    private ImageView card_back_image;
    public MediaPlayer card_front_media;
    public MediaPlayer card_back_media;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mw_v1);

        card_front_image= (ImageView)findViewById(R.id.card_back_image);
        card_back_image= (ImageView)findViewById(R.id.card_front_image) ;

        Intent intent = getIntent();

        String valueCheck = intent.getStringExtra("vowels");

        findViews();

        function(valueCheck);
        card_front_media.start();

        loadAnimations();
        changeCameraDistance();
    }


    private void changeCameraDistance() {
        int distance = 8000;
        float scale = getResources().getDisplayMetrics().density * distance;
        mCardFrontLayout.setCameraDistance(scale);
        mCardBackLayout.setCameraDistance(scale);
    }

    private void loadAnimations() {
        mSetRightOut = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.out_animation);
        mSetLeftIn = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.in_animation);
    }

    private void findViews() {
        mCardFrontLayout = findViewById(R.id.card_front_layoutId);
        mCardBackLayout = findViewById(R.id.card_back_layoutId);

    }

    public void flipCard(View view) {
        if (!mIsBackVisible) {
            mSetRightOut.setTarget(mCardFrontLayout);
            mSetLeftIn.setTarget(mCardBackLayout);
            mSetRightOut.start();
            mSetLeftIn.start();
            mIsBackVisible = true;
            card_front_media.start();

        } else {
            mSetRightOut.setTarget(mCardBackLayout);
            mSetLeftIn.setTarget(mCardFrontLayout);
            mSetRightOut.start();
            mSetLeftIn.start();
            mIsBackVisible = false;
            card_back_media.start();

        }
    }

    public void function(String valueCheck){

        if(valueCheck.equals("v1")){
            card_front_image.setImageResource(R.drawable.v1_front);
            card_back_image.setImageResource(R.drawable.v1_back);
            card_front_media = MediaPlayer.create(this,R.raw.v1_front);
            card_back_media = MediaPlayer.create(this,R.raw.v1_back);

        }

        else  if(valueCheck.equals("v2")){
            card_front_image.setImageResource(R.drawable.v2_front);
            card_back_image.setImageResource(R.drawable.v2_back);
            card_front_media = MediaPlayer.create(this,R.raw.v2_front);
            card_back_media = MediaPlayer.create(this,R.raw.v2_back);
        }

        else  if(valueCheck.equals("v3")){
            card_front_image.setImageResource(R.drawable.v3_front);
            card_back_image.setImageResource(R.drawable.v3_back);
            card_front_media = MediaPlayer.create(this,R.raw.v3_front);
            card_back_media = MediaPlayer.create(this,R.raw.v3_back);
        }

        else  if(valueCheck.equals("v4")){
            card_front_image.setImageResource(R.drawable.v4_front);
            card_back_image.setImageResource(R.drawable.v4_back);
            card_front_media = MediaPlayer.create(this,R.raw.v4_front);
            card_back_media = MediaPlayer.create(this,R.raw.v4_back);
        }

        else  if(valueCheck.equals("v5")){
            card_front_image.setImageResource(R.drawable.v5_front);
            card_back_image.setImageResource(R.drawable.v5_back);

            card_front_media = MediaPlayer.create(this,R.raw.v5_front);
            card_back_media = MediaPlayer.create(this,R.raw.v5_back);
        }

        else  if(valueCheck.equals("v6")){
            card_front_image.setImageResource(R.drawable.v6_front);
            card_back_image.setImageResource(R.drawable.v6_back);

           // card_front_media = MediaPlayer.create(this,R.raw.v6_rec);
            //card_back_media = MediaPlayer.create(this,R.raw.v6_back_rec);
        }

        else  if(valueCheck.equals("v7")){
            card_front_image.setImageResource(R.drawable.v7_front);
            card_back_image.setImageResource(R.drawable.v7_back);

            //card_front_media = MediaPlayer.create(this,R.raw.v7_rec);
            //card_back_media = MediaPlayer.create(this,R.raw.v7_back_rec);
        }

        else  if(valueCheck.equals("v8")){
            card_front_image.setImageResource(R.drawable.v8_front);
            card_back_image.setImageResource(R.drawable.v8_back);

      //      card_front_media = MediaPlayer.create(this,R.raw.v8_rec);
    //        card_back_media = MediaPlayer.create(this,R.raw.v8_back_rec);
        }

        else  if(valueCheck.equals("v9")){
            card_front_image.setImageResource(R.drawable.v9_front);
            card_back_image.setImageResource(R.drawable.v9_back);

           // card_front_media = MediaPlayer.create(this,R.raw.v9_rec);
            //card_back_media = MediaPlayer.create(this,R.raw.v9_back_rec);
        }

        else  if(valueCheck.equals("v10")){
            card_front_image.setImageResource(R.drawable.v10_front);
            card_back_image.setImageResource(R.drawable.v10_back);

            //card_front_media = MediaPlayer.create(this,R.raw.v10_rec);
            //card_back_media = MediaPlayer.create(this,R.raw.v10_back_rec);
        }

        else  if(valueCheck.equals("v11")){
            card_front_image.setImageResource(R.drawable.v11_front);
            card_back_image.setImageResource(R.drawable.v11_back);

            //card_front_media = MediaPlayer.create(this,R.raw.v11_rec);
            //card_back_media = MediaPlayer.create(this,R.raw.v11_back_rec);
        }


    }
}

