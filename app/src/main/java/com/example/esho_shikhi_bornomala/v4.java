package com.example.esho_shikhi_bornomala;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class v4 extends Fragment {

    MediaPlayer media_v4;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.v4, container, false);

         ImageView image= (ImageView)root.findViewById(R.id.content3_v4_ivid);


        media_v4 = MediaPlayer.create(getActivity(),R.raw.content_3_v4);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media_v4.start();

            }
        });
        return root;
    }
}
