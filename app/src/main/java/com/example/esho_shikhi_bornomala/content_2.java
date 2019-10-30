package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class content_2 extends AppCompatActivity {
    public MediaPlayer mediac1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_2);




    }




    public void clickNew(View c){
        if(c.getId() == R.id.ka_id){
            mediac1 =MediaPlayer.create(this,R.raw.ka);
        mediac1.start();}
        if(c.getId()==R.id.kha_id){
            mediac1 =MediaPlayer.create(this,R.raw.kha);

            mediac1.start();}
        if(c.getId() == R.id.ga_id){
            mediac1 =MediaPlayer.create(this,R.raw.ga);

            mediac1.start();}
        if(c.getId() == R.id.gha_id) {
            mediac1 =MediaPlayer.create(this,R.raw.gha);

            mediac1.start();
        }
        if(c.getId() == R.id.umo_id) {
            mediac1 =MediaPlayer.create(this,R.raw.umo);

            mediac1.start();
        }
    }
}