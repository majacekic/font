package com.aling.fontsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.aling.fontsample.activities.FontAppCompatActivity;
import com.aling.fontsample.animations.DepthPageTransformer;
import com.aling.fontsample.fragments.MixedFontsFragment;
import com.aling.fontsample.fragments.TextViewFragment;

/**
 * Created by Maja Cekic on 3/20/16.
 */
public class FontSampleActivity extends FontAppCompatActivity {

    private ViewPager mViewPager;
    private PagesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_sample);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // setting title with font
        setTitle(getString(R.string.app_name));

        init();
    }

    private void init() {

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setPageTransformer(true, new DepthPageTransformer());
        mAdapter = new PagesAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
    }

    public class PagesAdapter extends FragmentPagerAdapter {
        public static final int PAGES = 2;

        public PagesAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return TextViewFragment.newInstance();
                case 1:
                    return MixedFontsFragment.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            return PAGES;
        }
    }

}
