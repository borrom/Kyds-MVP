package com.goldenkyds.kydsmvp.view;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.goldenkyds.kydsmvp.R;
import com.goldenkyds.kydsmvp.view.fragment.KidFragment;


public class MainActivity extends AbsActivity {

    public static final String CURRENT_FRAGMENT = "CURRENT_FRAGMENT";
    private DrawerLayout mDrawerLayout;
    private Fragment mCurrentFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout)findViewById(R.id.main_drawer);

        NavigationView navigationView = (NavigationView)findViewById(R.id.main_navigation);

        navigationView.setNavigationItemSelectedListener(mOnNavigationClick);

        mCurrentFragment = KidFragment.getInstance(mDrawerLayout);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_container,mCurrentFragment)
                .commit();

    }

    final private NavigationView.OnNavigationItemSelectedListener mOnNavigationClick =
            new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem menuItem) {
            menuItem.setChecked(true);
            mDrawerLayout.closeDrawers();
            return true;
        }
    };

}
