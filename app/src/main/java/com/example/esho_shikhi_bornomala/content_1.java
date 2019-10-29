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

        //mediaV1 = MediaPlayer.create(this,R.raw.v1_rec);




    }

    public void clickNew(View v)
    {
        if(v.getId() == R.id.shore_o_id){
            mediaV1 = MediaPlayer.create(this,R.raw.shore_o);
            mediaV1.start();

        }
        if(v.getId() == R.id.shore_a_id){
            mediaV1 = MediaPlayer.create(this,R.raw.shore_a);
            mediaV1.start();
        }
        if(v.getId() == R.id.hrossho_e_id)     {
            mediaV1 = MediaPlayer.create(this,R.raw.hrossho_e);
        mediaV1.start();
        }
        if(v.getId() == R.id.dirgho_e_id)          {
            mediaV1 = MediaPlayer.create(this,R.raw.dirgho_e);
              mediaV1.start();
        }
        if(v.getId() == R.id.hrossho_u_id){
            mediaV1 = MediaPlayer.create(this,R.raw.hrossho_u);
        mediaV1.start();
        }
    }

}