package com.aling.fontsample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aling.fontsample.R;

/**
 * Created by Maja Cekic on 3/20/16.
 */
public class TextViewFragment extends Fragment {
    public static final String TAG = "TextViewFragment";


    private static TextViewFragment instance;

    public TextViewFragment() {
    }

    public static TextViewFragment newInstance() {
        if (instance == null) {
            instance = new TextViewFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_text_view, container, false);
    }
}

