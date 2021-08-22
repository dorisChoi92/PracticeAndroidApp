package com.example.practiceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class ViewPagerMainActivity extends AppCompatActivity {
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_main);

        Button button = findViewById(R.id.viewPagerButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(2);
            }
        });

        pager = findViewById(R.id.viewPager);
        pager.setOffscreenPageLimit(3);

        MaPagerAdapter adapter = new MaPagerAdapter(getSupportFragmentManager());

        TabFragment1 fragment1 = new TabFragment1();
        adapter.addItem(fragment1);
        TabFragment2 fragment2 = new TabFragment2();
        adapter.addItem(fragment2);
        TabFragment3 fragment3 = new TabFragment3();
        adapter.addItem(fragment3);

        pager.setAdapter(adapter);
    }

    class MaPagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<Fragment>();
        public MaPagerAdapter(FragmentManager fm) {
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

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return "페이지" + position;
        }
    }

}