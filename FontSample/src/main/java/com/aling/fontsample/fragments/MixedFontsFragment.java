package com.aling.fontsample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aling.font.Font;
import com.aling.fontsample.R;

/**
 * Created by Maja Cekic on 3/20/16.
 */
public class MixedFontsFragment extends Fragment {
    public static final String TAG = "MixedFontsFragment";


    private static MixedFontsFragment instance;

    public MixedFontsFragment() {
    }

    public static MixedFontsFragment newInstance() {
        if (instance == null) {
            instance = new MixedFontsFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mixed_fonts, container, false);
        TextView mixedFonts = (TextView) rootView.findViewById(R.id.mixed_fonts);

        mixedFonts.setText(Font.getSpannableString(getContext(), getString(R.string.font_mixed_1), Font.FONT_LIGHT));

        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_2_1), Font.FONT_REGULAR));
        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_2_2), Font.FONT_ITALIC));
        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_2_3), Font.FONT_REGULAR));

        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_3_1), Font.FONT_REGULAR));
        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_3_2), Font.FONT_BOLD));
        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_3_3), Font.FONT_REGULAR));
        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_3_4), Font.FONT_BOLD));
        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_3_5), Font.FONT_REGULAR));

        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_4), Font.FONT_REGULAR));
        mixedFonts.append(Font.getSpannableString(getContext(), getString(R.string.font_mixed_5), Font.FONT_REGULAR));

        return rootView;
    }
}

