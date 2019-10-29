package com.example.esho_shikhi_bornomala;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class v1 extends Fragment {
    public MediaPlayer media_v1;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.v1, container, false);
        media_v1 = MediaPlayer.create(getActivity(),R.raw.content_3_v1);
        media_v1.start();
        return root;
    }
}

