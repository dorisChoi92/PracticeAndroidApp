package com.example.practiceapp;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Mission06 extends AppCompatActivity {
    EditText editText;
    SeekBar seekBar;
    ProgressBar progressBar;
//    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_06);

        seekBar = findViewById(R.id.mission06SeekBar);
        progressBar = findViewById(R.id.mission06ProgressBar);
        editText = findViewById(R.id.mission06EditText);
        progressBar.setProgress(0);
        editText.setText("0");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progressBar.setProgress(i);
                editText.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}