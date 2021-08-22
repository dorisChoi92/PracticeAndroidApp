package com.example.practiceapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomTabMainActivity extends AppCompatActivity {
    TabFragment1 fragment1;
    TabFragment2 fragment2;
    TabFragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_tab_main);

        fragment1 = new TabFragment1();
        fragment2 = new TabFragment2();
        fragment3 = new TabFragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.bottomTabContainer, fragment1).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@Nullable MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottomTab1:
                        Toast.makeText(getApplicationContext(), "첫 번째 탭 선택", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.bottomTabContainer, fragment1).commit();
                        return true;
                    case R.id.bottomTab2:
                        Toast.makeText(getApplicationContext(), "두 번째 탭 선택", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.bottomTabContainer, fragment2).commit();
                        return true;
                    case R.id.bottomTab3:
                        Toast.makeText(getApplicationContext(), "세 번째 탭 선택", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.bottomTabContainer, fragment3).commit();
                        return true;
                }

                return false;
            }
        });
    }
}