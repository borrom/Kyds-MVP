package com.goldenkyds.kydsmvp.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goldenkyds.kydsmvp.R;
import com.goldenkyds.kydsmvp.view.adapter.KidPagerAdapter;

/**
 * Created by borrom on 6/25/15.
 */
public class KidFragment extends AbsFragment{

    private  DrawerLayout mDrawerLayout;

    public static final KidFragment fragment = new KidFragment();

    public static Fragment getInstance(DrawerLayout layout){
        fragment.mDrawerLayout = layout;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager pager = (ViewPager)view.findViewById(R.id.home_pager);
        pager.setAdapter(new KidPagerAdapter(getChildFragmentManager()));

        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.main_tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Health Checked"));
        tabLayout.addTab(tabLayout.newTab().setText("Daily Checked"));
        tabLayout.addTab(tabLayout.newTab().setText("Next Checked"));
        tabLayout.addTab(tabLayout.newTab().setText("Change"));
        tabLayout.addTab(tabLayout.newTab().setText("Status"));

        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

    @Override
    DrawerLayout getDrawerLayout() {
        return mDrawerLayout;
    }
}
