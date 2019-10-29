package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mw_consonants extends AppCompatActivity {
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
        setContentView(R.layout.activity_mw_consonants);

        card_front_image = (ImageView) findViewById(R.id.card_back_image);
        card_back_image = (ImageView) findViewById(R.id.card_front_image);

        Intent intent = getIntent();

        String valueCheck = intent.getStringExtra("consonants");

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
        mCardFrontLayout = findViewById(R.id.card_front_layoutId_for_consonants);
        mCardBackLayout = findViewById(R.id.card_back_layoutId_for_consonants);

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

    public void function(String valueCheck) {

        if (valueCheck.equals("c1")) {
            card_front_image.setImageResource(R.drawable.c1_front);
            card_back_image.setImageResource(R.drawable.c1_back);
            card_front_media = MediaPlayer.create(this, R.raw.c1_front);
            card_back_media = MediaPlayer.create(this, R.raw.c1_back);

        }

        else if (valueCheck.equals("c2")) {
            card_front_image.setImageResource(R.drawable.c2_front);
            card_back_image.setImageResource(R.drawable.c2_back);
            card_front_media = MediaPlayer.create(this, R.raw.c2_front);
            card_back_media = MediaPlayer.create(this, R.raw.c2_back);
        }

        else if (valueCheck.equals("c3")) {
            card_front_image.setImageResource(R.drawable.c3_front);
            card_back_image.setImageResource(R.drawable.c3_back);
                card_front_media = MediaPlayer.create(this, R.raw.c3_front);
                card_back_media = MediaPlayer.create(this, R.raw.c3_back);
        }

        else if (valueCheck.equals("c4")) {
            card_front_image.setImageResource(R.drawable.c4_front);
            card_back_image.setImageResource(R.drawable.c4_back);
            card_front_media = MediaPlayer.create(this, R.raw.c4_front);
                card_back_media = MediaPlayer.create(this, R.raw.c4_back);
        }

        else if (valueCheck.equals("c5")) {
            card_front_image.setImageResource(R.drawable.c5_front);
            card_back_image.setImageResource(R.drawable.c5_back);

              card_front_media = MediaPlayer.create(this, R.raw.c5_front);
                 card_back_media = MediaPlayer.create(this, R.raw.c5_back);
        }

        else if (valueCheck.equals("c6")) {
            card_front_image.setImageResource(R.drawable.c6_front);
            card_back_image.setImageResource(R.drawable.c6_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }


        else if (valueCheck.equals("c7")) {
            card_front_image.setImageResource(R.drawable.c7_front);
            card_back_image.setImageResource(R.drawable.c7_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }

        else if (valueCheck.equals("c8")) {
            card_front_image.setImageResource(R.drawable.c8_front);
            card_back_image.setImageResource(R.drawable.c8_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }

        else if (valueCheck.equals("c9")) {
            card_front_image.setImageResource(R.drawable.c9_front);
            card_back_image.setImageResource(R.drawable.c9_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }

        else if (valueCheck.equals("c10")) {
            card_front_image.setImageResource(R.drawable.c10_front);
            card_back_image.setImageResource(R.drawable.c10_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }

        else if (valueCheck.equals("c11")) {
            card_front_image.setImageResource(R.drawable.c11_front);
            card_back_image.setImageResource(R.drawable.c11_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }

        else if (valueCheck.equals("c12")) {
            card_front_image.setImageResource(R.drawable.c12_front);
            card_back_image.setImageResource(R.drawable.c12_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }

        else if (valueCheck.equals("c13")) {
            card_front_image.setImageResource(R.drawable.c13_front);
            card_back_image.setImageResource(R.drawable.c13_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //     card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }

        else if (valueCheck.equals("c14")) {
            card_front_image.setImageResource(R.drawable.c14_front);
            card_back_image.setImageResource(R.drawable.c14_back);

            //  card_front_media = MediaPlayer.create(this, R.raw.v5_rec);
            //  card_back_media = MediaPlayer.create(this, R.raw.v5_back_rec);
        }



    }
}

