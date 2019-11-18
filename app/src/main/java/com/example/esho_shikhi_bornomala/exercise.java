package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exercise extends AppCompatActivity {

    Button buttonForPicMatching,buttonFillintheblanks,buttonAudioMatchLetter,buttonSentenceMaking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        buttonForPicMatching = (Button)findViewById(R.id.buttonForPicMatching);
        buttonFillintheblanks = (Button)findViewById(R.id.buttonFillintheblanks);
        buttonAudioMatchLetter = (Button)findViewById(R.id.buttonAudioMatchLetter);
        buttonSentenceMaking= (Button)findViewById(R.id.buttonSentenceMaking);
        buttonForPicMatching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent picMatchingExercise =new Intent(exercise.this,picMatching.class);
                startActivity(picMatchingExercise);

            }
        });
        buttonFillintheblanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent fillInThBlanksExercise =new Intent(exercise.this,FillInTheBlanks.class);
                startActivity(fillInThBlanksExercise);

            }
        });

        buttonAudioMatchLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent audioMatchLetterExercise = new Intent(exercise.this,AudioMatchLetter.class);
                        startActivity(audioMatchLetterExercise);
            }
        });


        buttonSentenceMaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sentenceMakingexercise = new Intent(exercise.this,sentenceMaking.class);
                startActivity(sentenceMakingexercise);
            }
        });    }
}
