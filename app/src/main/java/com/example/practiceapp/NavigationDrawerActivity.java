package com.example.practiceapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practiceapp.databinding.ActivityNavigationDrawerBinding;

import org.jetbrains.annotations.NotNull;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    TabFragment1 fragment1;
    TabFragment2 fragment2;
    TabFragment3 fragment3;

    DrawerLayout drawer;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        toolbar = findViewById(R.id.navigationDrawerToolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragment1 = new TabFragment1();
        fragment2 = new TabFragment2();
        fragment3 = new TabFragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.navigationDrawerContainer, fragment1).commit();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.navigationDrawerMenu1) {
            Toast.makeText(this, "첫 번째 메뉴 선택", Toast.LENGTH_SHORT).show();
            toolbar.setTitle("첫 번째 화면");
            getSupportFragmentManager().beginTransaction().replace(R.id.navigationDrawerContainer, fragment1).commit();
        } else if (id == R.id.navigationDrawerMenu2) {
            Toast.makeText(this, "두 번째 메뉴 선택", Toast.LENGTH_SHORT).show();
            toolbar.setTitle("두 번째 화면");
            getSupportFragmentManager().beginTransaction().replace(R.id.navigationDrawerContainer, fragment2).commit();
        } else if (id == R.id.navigationDrawerMenu3) {
            Toast.makeText(this, "세 번째 메뉴 선택", Toast.LENGTH_SHORT).show();
            toolbar.setTitle("세 번째 화면");
            getSupportFragmentManager().beginTransaction().replace(R.id.navigationDrawerContainer, fragment3).commit();
        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}