package com.aling.font;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/**
 * Created by Maja Cekic on 3/19/16.
 */
public class FontTypefaceSpan extends TypefaceSpan {
    public static final String TAG = "FontTypefaceSpan";

    private static final float SKEW_X_ITALIC = -0.25f;

    private final Typeface mTypeface;

    public FontTypefaceSpan(String family, Typeface typeface) {
        super(family);
        mTypeface = typeface;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        applyCustomTypeface(ds, mTypeface);
    }

    @Override
    public void updateMeasureState(TextPaint paint) {
        applyCustomTypeface(paint, mTypeface);
    }

    private void applyCustomTypeface(Paint paint, Typeface tf) {
        int oldStyle;
        Typeface old = paint.getTypeface();
        if (old == null) {
            oldStyle = 0;
        } else {
            oldStyle = old.getStyle();
        }

        int fake = oldStyle & ~tf.getStyle();
        if ((fake & Typeface.BOLD) != 0) {
            paint.setFakeBoldText(true);
        }

        if ((fake & Typeface.ITALIC) != 0) {
            paint.setTextSkewX(SKEW_X_ITALIC);
        }

        paint.setTypeface(tf);
    }
}
