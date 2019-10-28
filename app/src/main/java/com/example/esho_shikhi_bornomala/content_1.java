package com.example.esho_shikhi_bornomala;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class content_1 extends AppCompatActivity {
    public MediaPlayer mediaV1,mediaV2,mediaV3,mediaV4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_1);

        mediaV1 = MediaPlayer.create(this,R.raw.v1_rec);
        mediaV2 = MediaPlayer.create(this,R.raw.v2_rec);

        mediaV3 = MediaPlayer.create(this,R.raw.v3_rec);
        mediaV4 = MediaPlayer.create(this,R.raw.v4_rec);



    }

    public void clickNew(View v)
    {
        if(v.getId() == R.id.shore_o_id)
            mediaV1.start();
        if(v.getId() == R.id.shore_a_id)
            mediaV2.start();
        if(v.getId() == R.id.hrossho_e_id)
            mediaV3.start();
        if(v.getId() == R.id.dirgho_e_id)
            mediaV4.start();
    }

}