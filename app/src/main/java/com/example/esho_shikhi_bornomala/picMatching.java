package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class picMatching extends AppCompatActivity {

    Button picMatchingConsonantPart1Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_matching);
        picMatchingConsonantPart1Button = (Button)findViewById(R.id.picMatchingConsosnantPart1Button);

        picMatchingConsonantPart1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent picMatchingConsonantPart1Intent =new Intent(picMatching.this,picMatchConsPart1.class);
                startActivity(picMatchingConsonantPart1Intent);
            }
        });
    }
}
