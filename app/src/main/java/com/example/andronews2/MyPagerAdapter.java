package com.example.andronews2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MyPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

            if(position == 0) {
                return new TabViewed();
            }
            else if(position == 1) {
                return new TabEmailed();
            }
            else {
                return new TabShared();
            }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Viewed";
            case 1:
                return "Emailed";
            case 2:
                return "Shared";
            default:
                return null;
        }
    }
}