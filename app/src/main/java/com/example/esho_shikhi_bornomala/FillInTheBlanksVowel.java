package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class FillInTheBlanksVowel extends AppCompatActivity {
    int Click=0;
    String valueCheck;
    public MediaPlayer mediaV1, mediaV2, mediaV3, mediaV4,mediaCheer;

    ImageView imageForVowel;
    TextView BlankText,underscore;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radiobutton;
    RadioGroup radioGroupFillInTheBlank;
    int x, flag = 0;
    int[] vowels = {R.string.v1_text, R.string.v2_text, R.string.v3_text, R.string.v4_text, R.string.v5_text,
            R.string.v6_text, R.string.v7_text, R.string.v8_text, R.string.v9_text, R.string.v10_text,
            R.string.v11_text};

    int[] imageGula = {R.drawable.oli, R.drawable.aam, R.drawable.idur, R.drawable.eagle, R.drawable.camel,
            R.drawable.usha, R.drawable.hrishi, R.drawable.ektara, R.drawable.oirabot,R.drawable.oju, R.drawable.oshudh};

    int[] blankString = {R.string.v1_blank_string, R.string.v2_blank_string, R.string.v3_blank_string, R.string.v4_blank_string, R.string.v5_blank_string,
            R.string.v6_blank_string, R.string.v7_blank_string, R.string.v8_blank_string, R.string.v9_blank_string, R.string.v10_blank_string,
            R.string.v11_blank_string};

    int[] audios = {R.raw.shore_o, R.raw.shore_a, R.raw.hrossho_e, R.raw.dirgho_e, R.raw.hrossho_u, R.raw.shore_o, R.raw.shore_a,
            R.raw.hrossho_e, R.raw.dirgho_e, R.raw.hrossho_u, R.raw.dirgho_e};
    int[] rbPosition = new int[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in_the_blanks_vowel);
        mediaCheer = MediaPlayer.create(this, R.raw.audiocheering);


        imageForVowel = (ImageView) findViewById(R.id.imageForVowel);
        BlankText = (TextView) findViewById(R.id.blankTextForVowel);
        underscore = (TextView) findViewById(R.id.textView_underscore);

        radioGroupFillInTheBlank = (RadioGroup) findViewById(R.id.radioGroupForBlankText);

        radioButton1 = (RadioButton) findViewById(R.id.rbForBlank1);
        radioButton2 = (RadioButton) findViewById(R.id.rbForBlank2);
        radioButton3 = (RadioButton) findViewById(R.id.rbForBlank3);
        radioButton4 = (RadioButton) findViewById(R.id.rbForBlank4);


        Intent intent = getIntent();

        valueCheck = intent.getStringExtra("Act");
        check(valueCheck);

        ImageButton button = (ImageButton) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   underscore.setText("______");
              //  underscore.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
                Click++;
                if (flag == 1) {
                    flag = 0;


                    x = (int) (Math.random() * ((10 - 0) + 1));


                    BlankText.setText(blankString[x]);
                    imageForVowel.setImageResource(imageGula[x]);

                    //   int xRadio = (int) (Math.random() * ((3 - 1) + 1));


                    //   int y = (int) (Math.random() * ((3 - 0) + 1)) + 1;//for radiobutton

                    rbPosition[0] = (int) (Math.random() * ((10 - 0) + 1));
                    rbPosition[1] = (int) (Math.random() * ((10 - 0) + 1));
                    rbPosition[2] = (int) (Math.random() * ((10- 0) + 1));
                    rbPosition[3] = (int) (Math.random() * ((10 - 0) + 1));


                    while (rbPosition[0] == rbPosition[1] || rbPosition[1] == rbPosition[2] || rbPosition[2] == rbPosition[3] ||
                            rbPosition[3] == rbPosition[0] || rbPosition[0] == rbPosition[2] || rbPosition[1] == rbPosition[3] ||
                            rbPosition[0] == x || rbPosition[1] == x || rbPosition[2] == x || rbPosition[3] == x) {

                        rbPosition[0] = (int) (Math.random() * ((10 - 0) + 1));

                        rbPosition[1] = (int) (Math.random() * ((10- 0) + 1));
                        rbPosition[2] = (int) (Math.random() * ((10 - 0) + 1));
                        rbPosition[3] = (int) (Math.random() * ((10 - 0) + 1));
                    }
                    int ans = (int) (Math.random() * ((3 - 0) + 1));

                    rbPosition[ans] = x;

                    radioButton1.setText(vowels[rbPosition[0]]);
                    radioButton2.setText(vowels[rbPosition[1]]);
                    radioButton3.setText(vowels[rbPosition[2]]);
                    radioButton4.setText(vowels[rbPosition[3]]);






                }
            }
        });





        radioGroupFillInTheBlank.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                                                @Override
                                                                public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                                    radiobutton = (RadioButton) findViewById(checkedId);
                                                                    String text = getResources().getString(vowels[x]);
                                                                    if (radiobutton.getText().equals(text)) {
                                                                        //showGreenToast();
                                                                        mediaCheer.start();


                                                                        radioButton4.setChecked(false);
                                                                        radioButton3.setChecked(false);
                                                                        radioButton2.setChecked(false);
                                                                        radioButton1.setChecked(false);

                                                                        // underscore.setText(text);
                                                                        flag = 1;
                                                                        //  Toast.makeText(getBaseContext(), text, Toast.LENGTH_SHORT).show();
                                                                        //
                                                                    } else if(flag==0){

                                                                        radioButton4.setChecked(false);
                                                                        radioButton3.setChecked(false);
                                                                        radioButton2.setChecked(false);
                                                                        radioButton1.setChecked(false);


                                                                        showYellowToast();}

                                                                }
                                                            }
        );


    }


    public void showGreenToast() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.green_toast_item, null);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
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


    //---------------


    public void check(String valueCheck) {
        if (valueCheck.equals("A")) {


            BlankText.setText(blankString[0]);
            imageForVowel.setImageResource(imageGula[0]);
            radioButton1.setText(vowels[3]);
            radioButton2.setText(vowels[2]);
            radioButton3.setText(vowels[0]);
            radioButton4.setText(vowels[1]);



            //    startActivity(intent);
        }

    }


    public void onRadioClick(View v) {
        if(v.getId()==R.id.rbForBlank1) {


            if (Click == 0)
                mediaV1 = MediaPlayer.create(this, audios[3]);
            else
                mediaV1 = MediaPlayer.create(this, audios[rbPosition[0]]);
            mediaV1.start();
        }
        if(v.getId()==R.id.rbForBlank2) {


            if (Click == 0)
                mediaV2 = MediaPlayer.create(this, audios[2]);
            else
                mediaV2 = MediaPlayer.create(this, audios[rbPosition[1]]);
            mediaV2.start();
        }

        if(v.getId()==R.id.rbForBlank3) {


            if (Click == 0)
                mediaV3 = MediaPlayer.create(this, audios[0]);
            else
                mediaV3 = MediaPlayer.create(this, audios[rbPosition[2]]);
            mediaV3.start();
        }

        if(v.getId()==R.id.rbForBlank4) {


            if (Click == 0)
                mediaV4 = MediaPlayer.create(this, audios[1]);
            else
                mediaV4 = MediaPlayer.create(this, audios[rbPosition[3]]);
            mediaV4.start();
        }

    }

}