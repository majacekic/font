package com.aling.font.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.aling.font.Font;
import com.aling.font.R;

/**
 * Created by Maja Cekic on 3/20/16.
 */
public class FButton extends Button {
    public static final String TAG = "FButton";

    private Typeface mTypeface;

    public FButton(Context context) {
        this(context, null);
    }

    public FButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyAttrs(context, attrs);
    }

    private void applyAttrs(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.FontStyle);
        String font = array.getString(R.styleable.FontStyle_customFont);
        applyFont(context, font);
        array.recycle();
    }

    private void applyFont(Context context, String font) {
        if (mTypeface != null) {
            return;
        }
        Typeface typeface = Font.getTypeface(context, font);
        if (typeface != null) {
            setTypeface(typeface);
            mTypeface = typeface;
        }
    }

}
