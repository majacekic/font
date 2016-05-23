package com.aling.fontsample;

import android.app.Application;

import com.aling.font.Font;

/**
 * Created by Maja Cekic on 3/20/16.
 */
public class FontSampleApplication extends Application {
    public static final String TAG = "FontSampleApplication";

    public static final String FONT_NAME = "JosefinSans";

    @Override
    public void onCreate() {
        super.onCreate();

        // Needed
        Font.setFontName(FONT_NAME);
        // Only if you want to use FontAppCompatActivity for easy managing toolbars font
        Font.setToolbarFont(Font.FONT_BOLD);
    }

}
