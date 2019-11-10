package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudioMatchLetter extends AppCompatActivity {

    Button audioMatchLetterVowelButton
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_match_letter);

        audioMatchLetterVowelButton = (Button) findViewById(R.id.audioMatchLetterVowelButton);

        audioMatchLetterVowelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent audioMatchLetterVowelIntent = new Intent(AudioMatchLetter.this,audioMatchLetterVowel.class);
                audioMatchLetterVowelIntent.putExtra("Act","A");
                startActivity(audioMatchLetterVowelIntent);
            }
        });
    }
}

