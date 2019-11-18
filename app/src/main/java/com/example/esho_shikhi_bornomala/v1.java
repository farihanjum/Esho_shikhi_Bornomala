package com.example.esho_shikhi_bornomala;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class v1 extends Fragment {

    ImageView image;
    public MediaPlayer media_v1;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.v1, container, false);

        image= (ImageView)root.findViewById(R.id.content3_v1_ivid);


        media_v1 = MediaPlayer.create(getActivity(),R.raw.content_3_v1);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media_v1.start();

            }
        });
        return root;
    }

}

