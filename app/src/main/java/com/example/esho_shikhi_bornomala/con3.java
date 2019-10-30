package com.example.esho_shikhi_bornomala;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

public class con3 extends Fragment {
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.cons3, container, false);
        MediaPlayer media_c1 = MediaPlayer.create(getActivity(), R.raw.content_3_c3);
        media_c1.start();
        return root;
    }
}