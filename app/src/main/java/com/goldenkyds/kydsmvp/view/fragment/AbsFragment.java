package com.goldenkyds.kydsmvp.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.goldenkyds.kydsmvp.R;

import java.util.IllegalFormatException;

/**
 * Created by borrom on 6/25/15.
 */
public abstract class AbsFragment extends Fragment{

    abstract DrawerLayout getDrawerLayout();

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = (Toolbar)view.findViewById(R.id.main_toolbar);
        if(toolbar == null){
            throw  new IllegalArgumentException("Please make sure your fragment have main_toolbar");
        }else {
            ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            final ActionBarDrawerToggle toggle =
                    new ActionBarDrawerToggle(getActivity(),
                            getDrawerLayout(), toolbar,R.string.open_pager, R.string.close_pager);

            getDrawerLayout().setDrawerListener(toggle);
            getDrawerLayout().post(new Runnable() {
                @Override
                public void run() {
                    toggle.syncState();
                }
            });

        }
    }
}
