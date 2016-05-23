package com.aling.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.HashMap;

/**
 * Created by Maja Cekic on 3/19/16.
 */
public class FontUtils {
    public static final String TAG = "FontUtils";

    private static HashMap<String, Typeface> sFontMap = new HashMap<String, Typeface>();

    /**
     * Returns a typeface from the specified font path.
     *
     * @param context
     * @param fontPath The file name of the font data in the assets directory
     * @return The new typeface.
     */
    protected static Typeface getTypeface(Context context, String fontPath) {
        Typeface typeface = sFontMap.get(fontPath);
        if (typeface != null) {
            return typeface;
        } else {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), fontPath);
                sFontMap.put(fontPath, typeface);
            } catch (Exception e) {
                Log.e(TAG, "File not found in assets: " + fontPath);
            }
            return typeface;
        }
    }
}
