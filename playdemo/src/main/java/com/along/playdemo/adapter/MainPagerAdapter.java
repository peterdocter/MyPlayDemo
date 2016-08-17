package com.along.playdemo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.along.playdemo.R;
import com.along.playdemo.fragment.FragmentFactory;

/**
 * Created by and2long on 16-7-31.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    // 定义当前需要加载的数组对象
    private String[] tabs;

    public MainPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        tabs = context.getResources().getStringArray(R.array.tab_names);
    }


    @Override
    public Fragment getItem(int position) {
        return FragmentFactory.createFragment(position);
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
