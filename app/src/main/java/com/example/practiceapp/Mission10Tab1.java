package com.example.practiceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Mission10Tab1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.mission_10_tab1, container, false);

        ViewPager pager = rootView.findViewById(R.id.mission10ViewPager);
        pager.setOffscreenPageLimit(3);

        CustomerPagerAdapter adapter = new CustomerPagerAdapter(getFragmentManager());

        TabFragment1 fragment1 = new TabFragment1();
        adapter.addItem(fragment1);
        TabFragment2 fragment2 = new TabFragment2();
        adapter.addItem(fragment2);
        TabFragment3 fragment3 = new TabFragment3();
        adapter.addItem(fragment3);

        pager.setAdapter(adapter);

        return rootView;
    }

    class CustomerPagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<Fragment>();

        public CustomerPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addItem(Fragment item) {
            items.add(item);
        }

        @Override
        public Fragment getItem(int position) {
            return items.get(position);
        }

        @Override
        public int getCount() {
            return items.size();
        }
    }
}
