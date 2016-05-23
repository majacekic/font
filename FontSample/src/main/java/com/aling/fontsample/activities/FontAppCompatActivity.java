package com.aling.fontsample.activities;

import android.support.v7.app.AppCompatActivity;

import com.aling.font.Font;

/**
 * Created by Maja Cekic on 3/20/16.
 */
public class FontAppCompatActivity extends AppCompatActivity {
    public static final String TAG = "FontAppCompatActivity";

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(Font.getToolbarSpannableString(getBaseContext(), (String) title));
    }

    @Override
    public void setTitle(int titleId) {
        super.setTitle(Font.getToolbarSpannableString(getBaseContext(), getString(titleId)));
    }
}
