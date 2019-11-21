package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class sentenceMaking extends AppCompatActivity {
    MediaPlayer mediaCheer;
    ImageView imageOption1,imageOption2,imageOption3,imageOption4;
    Button button_text_option_1,button_text_option_2,button_text_option_3,button_text_option_4;
    TextView blankSentence;

    int[] imageGula = {R.drawable.blanksentence1, R.drawable.blanksentence2, R.drawable.blanksentence3, R.drawable.blanksentence4,
            R.drawable.blanksentence5, R.drawable.blanksentence6, R.drawable.blanksentence7, R.drawable.blanksentence8,
            R.drawable.blanksentence9, R.drawable.blanksentence10};


    int[] buttonString = {R.string.c1_button_text_sentence,R.string.c2_button_text_sentence,R.string.c3_button_text_sentence,
            R.string.c4_button_text_sentence,R.string.c5_button_text_sentence, R.string.c6_button_text_sentence, R.string.c7_button_text_sentence,
            R.string.c8_button_text_sentence,R.string.c9_button_text_sentence,R.string.c10_button_text_sentence};


    int[] sentence = {R.string.c1_sentence, R.string.c2_sentence, R.string.c3_sentence, R.string.c4_sentence,
            R.string.c5_sentence, R.string.c6_sentence, R.string.c7_sentence, R.string.c8_sentence,
            R.string.c9_sentence, R.string.c10_sentence};
    int[] rbPosition = new int[5];

    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence_making);
        random();
        mediaCheer = MediaPlayer.create(this, R.raw.audiocheering);

        button_text_option_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button)v;
                String text = b.getText().toString();
                String text2=  getResources().getString(buttonString[x]);

                if(text.equals(text2)){
                    mediaCheer.start();
                    // Toast.makeText(sentenceMaking.this,"Happy",LENGTH_SHORT).show();


                    random();
                }
                else{
                    //Toast.makeText(sentenceMaking.this,"sad",LENGTH_SHORT).show();
                    showYellowToast();

                }
            }
        });


        button_text_option_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button)v;
                String text = b.getText().toString();
                String text2=  getResources().getString(buttonString[x]);

                if(text.equals(text2)){
                    mediaCheer.start();
                    // Toast.makeText(sentenceMaking.this,"Happy",LENGTH_SHORT).show();


                    random();
                }
                else{
                    //Toast.makeText(sentenceMaking.this,"sad",LENGTH_SHORT).show();
                    showYellowToast();

                }
            }
        });

        button_text_option_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button)v;
                String text = b.getText().toString();
                String text2=  getResources().getString(buttonString[x]);

                if(text.equals(text2)){
                    mediaCheer.start();
                    // Toast.makeText(sentenceMaking.this,"Happy",LENGTH_SHORT).show();


                    random();
                }
                else{
                    //Toast.makeText(sentenceMaking.this,"sad",LENGTH_SHORT).show();
                    showYellowToast();

                }
            }
        });
        button_text_option_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button)v;
                String text = b.getText().toString();
                String text2=  getResources().getString(buttonString[x]);

                if(text.equals(text2)){
                mediaCheer.start();
                   // Toast.makeText(sentenceMaking.this,"Happy",LENGTH_SHORT).show();


                    random();
                }
                else{
                    //Toast.makeText(sentenceMaking.this,"sad",LENGTH_SHORT).show();
                    showYellowToast();

                }
            }
        });
    }


    public void random(){
        x = (int) (Math.random() * ((9 - 0) + 1));




        while (rbPosition[0] == rbPosition[1] || rbPosition[1] == rbPosition[2] || rbPosition[2] == rbPosition[3] ||
                rbPosition[3] == rbPosition[0] || rbPosition[0] == rbPosition[2] || rbPosition[1] == rbPosition[3] ||
                rbPosition[0] == x || rbPosition[1] == x || rbPosition[2] == x || rbPosition[3] == x) {


            rbPosition[0] = (int) (Math.random() * ((9 - 0) + 1));
            rbPosition[1] = (int) (Math.random() * ((9 - 0) + 1));
            rbPosition[2] = (int) (Math.random() * ((9- 0) + 1));
            rbPosition[3] = (int) (Math.random() * ((9 - 0) + 1));
        }

        int ans = (int) (Math.random() * ((3 - 0) + 1));

        rbPosition[ans] = x;


        imageOption1= (ImageView)findViewById(R.id.picMatch_option_1);
        imageOption1.setImageResource(imageGula[rbPosition[0]]);
        button_text_option_1 = (Button)findViewById(R.id.button_text_option_1);
        button_text_option_1.setText(buttonString[rbPosition[0]]);

        imageOption2= (ImageView)findViewById(R.id.picMatch_option_2);
        imageOption2.setImageResource(imageGula[rbPosition[1]]);
        button_text_option_2 = (Button)findViewById(R.id.button_text_option_2);
        button_text_option_2.setText(buttonString[rbPosition[1]]);

        imageOption3= (ImageView)findViewById(R.id.picMatch_option_3);
        imageOption3.setImageResource(imageGula[rbPosition[2]]);
        button_text_option_3 = (Button)findViewById(R.id.button_text_option_3);
        button_text_option_3.setText(buttonString[rbPosition[2]]);


        imageOption4= (ImageView)findViewById(R.id.picMatch_option_4);
        imageOption4.setImageResource(imageGula[rbPosition[3]]);
        button_text_option_4 = (Button)findViewById(R.id.button_text_option_4);
        button_text_option_4.setText(buttonString[rbPosition[3]]);

        blankSentence= (TextView)findViewById(R.id.blankSentenceTextViewId);
        blankSentence.setText(sentence[x]);

    }

    public void showYellowToast() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.yellow_toast_item, null);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
}
