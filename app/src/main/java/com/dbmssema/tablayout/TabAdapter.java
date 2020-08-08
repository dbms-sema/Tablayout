package com.dbmssema.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    private int tabNum;
    public TabAdapter(@NonNull FragmentManager fm, int behavior, int tabcount) {
        super(fm, behavior);
        this.tabNum = tabcount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new ChatFragment();

            }
            case 1:{

                return new StatusFragment();

            }
            case 2:{

                return new CallsFragment();

            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabNum;
    }
}
