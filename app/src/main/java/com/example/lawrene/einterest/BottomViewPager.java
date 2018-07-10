package com.example.lawrene.einterest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by lawrene on 7/8/18.
 */

public class BottomViewPager extends FragmentPagerAdapter {
    public BottomViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;

            case 1:
                SearchFragment searchFragment = new SearchFragment();
                return searchFragment;

            case 2:
                FavoritesFragment favoritesFragment = new FavoritesFragment();
                return favoritesFragment;

            case 3:
                TicketsFragment ticketsFragment = new TicketsFragment();
                return ticketsFragment;

            case 4:
                ProfileFragment profileFragment = new ProfileFragment();
                return profileFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
