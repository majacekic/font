package com.aling.font;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Log;

/**
 * Created by Maja Cekic on 3/19/16.
 */
public class Font {
    public static final String TAG = "Font";

     /*
    Font names
     */

    public static final String FONT_REGULAR = "regular";

    public static final String FONT_BOLD = "bold";

    public static final String FONT_BOLD_ITALIC = "boldItalic";

    public static final String FONT_ITALIC = "italic";

    public static final String FONT_LIGHT = "light";

    public static final String FONT_LIGHT_ITALIC = "lightItalic";

    public static final String FONT_SEMI_BOLD = "semiBold";

    public static final String FONT_SEMI_BOLD_ITALIC = "semiBoldItalic";

    public static final String FONT_THIN = "thin";

    public static final String FONT_THIN_ITALIC = "thinItalic";

    /*
    Font paths
     */

    private static final String FONT_ROOT = "fonts/";

    private static final String FONT_PATH_REGULAR = "-Regular.ttf";

    private static final String FONT_PATH_BOLD = "-Bold.ttf";

    private static final String FONT_PATH_BOLD_ITALIC = "-BoldItalic.ttf";

    private static final String FONT_PATH_ITALIC = "-Italic.ttf";

    private static final String FONT_PATH_LIGHT = "-Light.ttf";

    private static final String FONT_PATH_LIGHT_ITALIC = "-LightItalic.ttf";

    private static final String FONT_PATH_SEMI_BOLD = "-SemiBold.ttf";

    private static final String FONT_PATH_SEMI_BOLD_ITALIC = "-SemiBoldItalic.ttf";

    private static final String FONT_PATH_THIN = "-Thin.ttf";

    private static final String FONT_PATH_THIN_ITALIC = "-ThinItalic.ttf";

    /*
    Font ids
     */

    private static final int FONT_ID_INVALID = -1;

    private static final int FONT_ID_REGULAR = 1;

    private static final int FONT_ID_BOLD = 2;

    private static final int FONT_ID_BOLD_ITALIC = 3;

    private static final int FONT_ID_ITALIC = 4;

    private static final int FONT_ID_LIGHT = 5;

    private static final int FONT_ID_LIGHT_ITALIC = 6;

    private static final int FONT_ID_SEMI_BOLD = 7;

    private static final int FONT_ID_SEMI_BOLD_ITALIC = 8;

    private static final int FONT_ID_THIN = 9;

    private static final int FONT_ID_THIN_ITALIC = 10;


    private static String sFontName;

    private static String sToolbarFont = FONT_REGULAR;

    public static void setFontName(String fontName) {
        sFontName = fontName;
    }

    public static String getFontName() {
        return sFontName;
    }

    public static void setToolbarFont(String fontName) {
        sToolbarFont = fontName;
    }

    /**
     * Returns a spannable string of a text, using specified toolbars font.
     *
     * @param context
     * @param text    The text
     * @return The new spannable string.
     */
    public static SpannableString getToolbarSpannableString(Context context, String text) {
        Typeface typeface = getTypeface(context, sToolbarFont);
        SpannableString spannableString = new SpannableString(text);
        if (typeface != null) {
            spannableString.setSpan(new FontTypefaceSpan("", typeface), 0, spannableString.length(),
                    Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        } else {
            Log.e(TAG, "Typeface not created for font: " + sToolbarFont);
        }
        return spannableString;
    }

    /**
     * Returns a spannable string of a text, using specified font name.
     *
     * @param context
     * @param text     The text
     * @param fontName The name of the font
     * @return The new spannable string.
     */
    public static SpannableString getSpannableString(Context context, String text, String fontName) {
        Typeface typeface = getTypeface(context, fontName);
        SpannableString spannableString = new SpannableString(text);
        if (typeface != null) {
            spannableString.setSpan(new FontTypefaceSpan("", typeface), 0, spannableString.length(),
                    Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        } else {
            Log.e(TAG, "Typeface not created for font: " + fontName);
        }
        return spannableString;
    }

    /**
     * Returns a id of the font.
     *
     * @param fontName The name of the font
     * @return The new typeface.
     */

    private static int getFontId(String fontName) {
        if (FONT_REGULAR.equals(fontName)) {
            return FONT_ID_REGULAR;
        } else if (FONT_BOLD.equals(fontName)) {
            return FONT_ID_BOLD;
        } else if (FONT_BOLD_ITALIC.equals(fontName)) {
            return FONT_ID_BOLD_ITALIC;
        } else if (FONT_ITALIC.equals(fontName)) {
            return FONT_ID_ITALIC;
        } else if (FONT_LIGHT.equals(fontName)) {
            return FONT_ID_LIGHT;
        } else if (FONT_LIGHT_ITALIC.equals(fontName)) {
            return FONT_ID_LIGHT_ITALIC;
        } else if (FONT_SEMI_BOLD.equals(fontName)) {
            return FONT_ID_SEMI_BOLD;
        } else if (FONT_SEMI_BOLD_ITALIC.equals(fontName)) {
            return FONT_ID_SEMI_BOLD_ITALIC;
        } else if (FONT_THIN.equals(fontName)) {
            return FONT_ID_THIN;
        } else if (FONT_THIN_ITALIC.equals(fontName)) {
            return FONT_ID_THIN_ITALIC;
        }
        return FONT_ID_INVALID;
    }

    /**
     * Returns a typeface from the specified font name.
     *
     * @param context
     * @param fontId  The id of the font
     * @return The new typeface.
     */
    protected static Typeface getTypeface(Context context, int fontId) {
        switch (fontId) {
            case FONT_ID_REGULAR:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_REGULAR);
            case FONT_ID_BOLD:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_BOLD);
            case FONT_ID_BOLD_ITALIC:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_BOLD_ITALIC);
            case FONT_ID_ITALIC:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_ITALIC);
            case FONT_ID_LIGHT:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_LIGHT);
            case FONT_ID_LIGHT_ITALIC:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_LIGHT_ITALIC);
            case FONT_ID_SEMI_BOLD:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_SEMI_BOLD);
            case FONT_ID_SEMI_BOLD_ITALIC:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_SEMI_BOLD_ITALIC);
            case FONT_ID_THIN:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_THIN);
            case FONT_ID_THIN_ITALIC:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_THIN_ITALIC);
            default:
                return FontUtils.getTypeface(context, FONT_ROOT + Font.getFontName() + FONT_PATH_REGULAR);
        }
    }

    /**
     * Returns a typeface from the specified font name.
     *
     * @param context
     * @param fontName The name of the font
     * @return The new typeface.
     */
    public static Typeface getTypeface(Context context, String fontName) {
        int fontId = getFontId(fontName);
        if (FONT_ID_INVALID != fontId) {
            return getTypeface(context, fontId);
        } else {
            Log.e(TAG, "Invalid font id.");
            return null;
        }
    }
}
