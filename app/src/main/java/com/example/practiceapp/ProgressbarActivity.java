package com.example.practiceapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressbarActivity extends AppCompatActivity {
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar);

        ProgressBar progressBar = findViewById(R.id.progressbarProgressBar);
        progressBar.setIndeterminate(false);
        progressBar.setProgress(80);

        Button button = findViewById(R.id.progressbarButton1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dialog = new ProgressDialog(ProgressbarActivity.this);
                dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                dialog.setMessage("데이터를 확인하는 중입니다.");

                dialog.show();
            }
        });

        Button button2 = findViewById(R.id.progressbarButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
    }
}