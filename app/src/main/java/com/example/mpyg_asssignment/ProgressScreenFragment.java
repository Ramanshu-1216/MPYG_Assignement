package com.example.mpyg_asssignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProgressScreenFragment extends Fragment {
    public ProgressScreenFragment() {

    }

    public static ProgressScreenFragment newInstance(String param1, String param2) {
        ProgressScreenFragment fragment = new ProgressScreenFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_progress__screen_, container, false);
    }
}