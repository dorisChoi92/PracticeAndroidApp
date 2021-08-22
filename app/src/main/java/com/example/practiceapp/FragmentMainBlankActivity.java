package com.example.practiceapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentMainBlankActivity extends AppCompatActivity {
    BlankFragment mainFragment;
    BlankMenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.for_fragment);

        mainFragment = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.forFragmentFragment);
        menuFragment = new BlankMenuFragment();
    }

    public void onFragmentChanged(int index) {
        if (index == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, menuFragment).commit();
        } else if (index == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        }
    }
}