package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class picMatchConsPart1 extends AppCompatActivity {

    MediaPlayer mediaCheering;

    ImageView curView = null;
    private int countPair = 0;
    final int[] drawable = { R.drawable.ka, R.drawable.kha, R.drawable.ga, R.drawable.gha, R.drawable.umo,
            R.drawable.ca, R.drawable.cha, R.drawable.ja,R.drawable.jha,R.drawable.eoo, R.drawable.pic_match_c1, R.drawable.pic_match_c2, R.drawable.pic_match_c3, R.drawable.pic_match_c4,
            R.drawable.pic_match_c5, R.drawable.pic_match_c6, R.drawable.pic_match_c7, R.drawable.pic_match_c8 ,R.drawable.pic_match_c9, R.drawable.pic_match_c10};

    int[][] pos = new int[20][2];

    int prevPos = -1; // -1 means no block is selected
    View prevView = null;

    private void makeToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    static private void randomize(int[][] arr, int n) {
        Random r = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            for (int k = 0; k < 2; k++) {
                int temp = arr[i][k];
                arr[i][k] = arr[j][k];
                arr[j][k] = temp;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_match_cons_part1);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        gridView.setAdapter(imageAdapter);

        for (int i = 0; i < 20; i++) {
            pos[i][0] = i; // pos[i][0] contains the drawable index (0~15)
            pos[i][1] = i % 10; // pos[i][1] contains the type of the drawable (okkhor) (0~7)
        }

        // uncomment this if you want the images to be random shuffled
        randomize(pos, 20);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int curPos, long id) {

                ((ImageView) view).setImageResource(drawable[pos[curPos][0]]); // if item is clicked show the picture

                if (prevPos < 0) {
                    int position = 0;
                    prevPos = position;
                    prevView = view;
                } else if (curPos == prevPos) { // if same image is pressed again
                    ((ImageView) prevView).setImageResource(R.drawable.hidden1); // hide it
                } else {
                    if (pos[prevPos][1] == pos[curPos][1]) { // match
                       // makeToast(" ** 😃😃😃😃😃 **");
                       // showGreenToast();

                        mediaCheering = MediaPlayer.create(picMatchConsPart1.this, R.raw.audiocheering);
                        mediaCheering.start();

                        // you can do whatever you do when a match is found (i just made them invisible)
                        ((ImageView) prevView).setVisibility(View.INVISIBLE);
                        ((ImageView) view).setVisibility(View.INVISIBLE);

                        prevPos = -1;
                        prevView = null;
                    } else { // not match
                        //makeToast(" ** 😔😔😔😔😔 ** ");
                        showYellowToast();
                        ((ImageView) prevView).setImageResource(R.drawable.hidden1); // hide the previous choice

                        prevPos = curPos;
                        prevView = view;
                    }
                }

            }
        });
    }

    public void showGreenToast() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.green_toast_item, null);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
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


}
