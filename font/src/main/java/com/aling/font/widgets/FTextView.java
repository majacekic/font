package com.aling.font.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.aling.font.Font;
import com.aling.font.R;

/**
 * Created by Maja Cekic on 3/19/16.
 */
public class FTextView extends TextView {
    public static final String TAG = "FTextView";

    private Typeface mTypeface;

    public FTextView(final Context context) {
        this(context, null);
    }

    public FTextView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FTextView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
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
