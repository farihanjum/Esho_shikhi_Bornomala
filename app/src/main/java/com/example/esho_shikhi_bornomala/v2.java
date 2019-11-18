package com.example.esho_shikhi_bornomala;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class v2 extends Fragment {

    ImageView image;
    MediaPlayer media_v2;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.v2, container, false);


        image= (ImageView)root.findViewById(R.id.content3_v2_ivid);


         media_v2 = MediaPlayer.create(getActivity(), R.raw.content_3_v2 );

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media_v2.start();

            }
        });

        return root;
    }
}
