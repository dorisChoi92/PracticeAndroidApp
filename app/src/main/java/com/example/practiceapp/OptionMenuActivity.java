package com.example.practiceapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class OptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int curId = item.getItemId();
        switch (curId) {
            case R.id.optionMenuRefresh:
                Toast.makeText(this, "새로고침 메뉴 선택됨", Toast.LENGTH_LONG).show();
                break;
            case R.id.optionMenuSearch:
                Toast.makeText(this, "검색 메뉴 선택됨", Toast.LENGTH_LONG).show();
                break;
            case R.id.optionMenuSettings:
                Toast.makeText(this, "설정 메뉴 선택됨", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}