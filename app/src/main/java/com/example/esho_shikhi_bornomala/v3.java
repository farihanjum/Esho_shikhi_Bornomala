package com.example.esho_shikhi_bornomala;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class v3 extends Fragment {
    MediaPlayer media_v3;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View
                root = inflater.inflate(R.layout.v3, container, false);

        ImageView image= (ImageView)root.findViewById(R.id.content3_v3_ivid);


        media_v3 = MediaPlayer.create(getActivity(),R.raw.content_3_v3);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media_v3.start();

            }
        });
        return root;
    }
}
