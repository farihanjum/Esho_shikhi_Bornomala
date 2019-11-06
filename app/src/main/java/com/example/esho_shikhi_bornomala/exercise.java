package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exercise extends AppCompatActivity {

    Button buttonForPicMatching;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        buttonForPicMatching = (Button)findViewById(R.id.buttonForPicMatching);
        buttonForPicMatching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent picMatchingExercise =new Intent(exercise.this,picMatching.class);
                startActivity(picMatchingExercise);

            }
        });
    }
}
