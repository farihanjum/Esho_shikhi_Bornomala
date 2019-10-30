package com.example.esho_shikhi_bornomala;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class v5 extends Fragment {
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.v5, container, false);
        MediaPlayer media_v5 = MediaPlayer.create(getActivity(), R.raw.content_3_v5);
        media_v5.start();
        return root;
    }
}
