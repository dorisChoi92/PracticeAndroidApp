package com.example.practiceapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.gravity);
//        setContentView(R.layout.baseline);
//        setContentView(R.layout.padding);
//        setContentView(R.layout.table_layout);
        setContentView(R.layout.relative_layout);
    }
}