package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FillInTheBlanks extends AppCompatActivity {
    Button fillInTheBlanksVowelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in_the_blanks);
        fillInTheBlanksVowelButton =(Button)findViewById(R.id.fillInTHeBlanksVowelButton);
        fillInTheBlanksVowelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filInTheBlanksVowelIntent = new Intent(FillInTheBlanks.this,FillInTheBlanksVowel.class);//button er nam ja intent er nam o ta


                filInTheBlanksVowelIntent.putExtra("Act","A");

                startActivity(filInTheBlanksVowelIntent);
            }
        });
    }
}
