package com.goldenkyds.kydsmvp.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.goldenkyds.kydsmvp.view.fragment.SampleFragment;

/**
 * Created by borrom on 6/25/15.
 */
public class KidPagerAdapter extends FragmentPagerAdapter{

    public KidPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new SampleFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
            return "Health Checked";
            case 1:
            return "Daily Checked";
            case 2:
                return "Next Checked";
            case 3:
                return "Change";
            case 4:
                return "Status";
        }
        return null;
    }
}
