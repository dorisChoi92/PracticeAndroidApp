package com.example.practiceapp;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Mission10 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    Mission10Tab1 tab1;
    Mission10Tab2 tab2;
    Mission10Tab3 tab3;
    Mission10Tab4 tab4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_10);

        toolbar = findViewById(R.id.mission10Toolbar);
        DrawerLayout drawer = findViewById(R.id.mission10DrawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navView = findViewById(R.id.mission10NaviView);
        navView.setNavigationItemSelectedListener(this);

        tab1 = new Mission10Tab1();
        getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab1).commit();


        BottomNavigationView bottomNavigationView = findViewById(R.id.mission10BottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@Nullable MenuItem item) {
                toolbar.setTitle(item.getTitle().toString());
                switch (item.getItemId()) {
                    case R.id.mission10Tab1:
                        tab1 = new Mission10Tab1();
                        getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab1).commit();
                        return true;
                    case R.id.mission10Tab2:
                        tab2 = new Mission10Tab2();
                        getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab2).commit();
                        return true;
                    case R.id.mission10Tab3:
                        tab3 = new Mission10Tab3();
                        getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab3).commit();
                        return true;
                    case R.id.mission10Tab4:
                        tab3 = new Mission10Tab3();
                        getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab4).commit();
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mission10Tab1) {
            tab1 = new Mission10Tab1();
            getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab1).commit();
        } else if (id == R.id.mission10Tab2) {
            tab2 = new Mission10Tab2();
            getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab2).commit();
        } else if (id == R.id.mission10Tab3) {
            tab3 = new Mission10Tab3();
            getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab3).commit();
        } else if (id == R.id.mission10Tab4) {
            tab4 = new Mission10Tab4();
            getSupportFragmentManager().beginTransaction().replace(R.id.mission10Container, tab4).commit();
        }

        toolbar.setTitle(item.getTitle().toString());
        DrawerLayout drawer = findViewById(R.id.mission10DrawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}