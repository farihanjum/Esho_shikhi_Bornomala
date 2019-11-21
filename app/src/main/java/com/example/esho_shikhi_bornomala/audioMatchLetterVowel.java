package com.example.esho_shikhi_bornomala;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;


public class audioMatchLetterVowel extends AppCompatActivity {
    int Click=0;
    String valueCheck;
    public MediaPlayer media,mediaCheer;

    ImageView imageOfMike;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5,radioButton6,radiobutton;
    int x, flag = 0;

    int[] vowels = {R.string.v1_text, R.string.v2_text, R.string.v3_text, R.string.v4_text, R.string.v5_text, R.string.v6_text, R.string.v7_text, R.string.v8_text, R.string.v9_text, R.string.v10_text, R.string.v11_text};

    int[] audios = {R.raw.shore_o, R.raw.shore_a, R.raw.hrossho_e, R.raw.dirgho_e, R.raw.hrossho_u,

            R.raw.dirgho_u, R.raw.hrii, R.raw.ee, R.raw.oiii, R.raw.oo, R.raw.

            ouu};

    int[] rbPosition = new int[8];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_match_letter_vowel);

        imageOfMike = (ImageView) findViewById(R.id.imageOfMike);
        ImageView next = (ImageView) findViewById(R.id.button);

        radioButton1 = (RadioButton) findViewById(R.id.rbForAudio1);
        radioButton2 = (RadioButton) findViewById(R.id.rbForAudio2);
        radioButton3 = (RadioButton) findViewById(R.id.rbForAudio3);
        radioButton4 = (RadioButton) findViewById(R.id.rbForAudio4);
        radioButton5 = (RadioButton) findViewById(R.id.rbForAudio5);
        radioButton6 = (RadioButton) findViewById(R.id.rbForAudio6);




        radioButton1.setText(vowels[3]);
        radioButton2.setText(vowels[2]);
        radioButton3.setText(vowels[0]);
        radioButton4.setText(vowels[6]);
        radioButton5.setText(vowels[1]);
        radioButton6.setText(vowels[4]);


        imageOfMike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                media = MediaPlayer.create(getApplicationContext(), audios[x]);
                media.start();


            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random();
                checkFalse();
            }
        });
    }




    public void showYellowToast() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.yellow_toast_item, null);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }



    public void onRadioClick(View v) {
        int z=v.getId();

        RadioButton radioBBBB = (RadioButton)findViewById(z);

        String text =getResources().getString(vowels[x]);

        if (radioBBBB.getText().equals(text)) {

            mediaCheer = MediaPlayer.create(this, R.raw.audiocheering);

            mediaCheer.start();


            flag = 1;
        }
        else
        {
            showYellowToast();

          checkFalse();}
    }




    public void random() {

        if (flag == 1) {
            x = (int) (Math.random() * ((10 - 0) + 1));

            media = MediaPlayer.create(this, audios[x]);


            while (rbPosition[0] == rbPosition[1] || rbPosition[1] == rbPosition[2] || rbPosition[2] == rbPosition[3] ||
                    rbPosition[3] == rbPosition[0] || rbPosition[0] == rbPosition[2] || rbPosition[1] == rbPosition[3] ||
                    rbPosition[0] == rbPosition[4] || rbPosition[0] == rbPosition[5] || rbPosition[1] == rbPosition[4] ||
                    rbPosition[2] == rbPosition[4] || rbPosition[1] == rbPosition[5] || rbPosition[2] == rbPosition[5] ||
                    rbPosition[3] == rbPosition[4] || rbPosition[3] == rbPosition[5] || rbPosition[5] == rbPosition[4] ||
                    rbPosition[0] == x || rbPosition[1] == x || rbPosition[2] == x ||
                    rbPosition[3] == x || rbPosition[4] == x || rbPosition[5] == x) {

                rbPosition[0] = (int) (Math.random() * ((10 - 0) + 1));
                rbPosition[1] = (int) (Math.random() * ((10 - 0) + 1));
                rbPosition[2] = (int) (Math.random() * ((10 - 0) + 1));
                rbPosition[3] = (int) (Math.random() * ((10 - 0) + 1));
                rbPosition[4] = (int) (Math.random() * ((10 - 0) + 1));
                rbPosition[5] = (int) (Math.random() * ((10 - 0) + 1));

            }
            int ans = (int) (Math.random() * ((4 - 0) + 1));

            rbPosition[ans] = x;

            radioButton1.setText(vowels[rbPosition[0]]);
            radioButton2.setText(vowels[rbPosition[1]]);
            radioButton3.setText(vowels[rbPosition[2]]);
            radioButton4.setText(vowels[rbPosition[3]]);
            radioButton5.setText(vowels[rbPosition[4]]);
            radioButton6.setText(vowels[rbPosition[5]]);


            flag = 0;
        }
    }



    public void checkFalse(){
        radioButton4.setChecked(false);
        radioButton3.setChecked(false);
        radioButton2.setChecked(false);
        radioButton1.setChecked(false);
        radioButton5.setChecked(false);
        radioButton6.setChecked(false);
    }





}
