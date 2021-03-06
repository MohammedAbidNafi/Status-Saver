package com.margsapp.statussaver.Adapter;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.margsapp.statussaver.Fragment.DownloadFragment;
import com.margsapp.statussaver.Fragment.ImageFragment;
import com.margsapp.statussaver.Fragment.VideoFragment;

import org.jetbrains.annotations.NotNull;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs;
    Activity activity;

    public ViewPagerAdapter(FragmentManager fm, int NumOfTabs, Activity activity) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.activity = activity;
    }

    @NotNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new ImageFragment();

            case 1:
                return new VideoFragment();

            case 2:
                return new DownloadFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}