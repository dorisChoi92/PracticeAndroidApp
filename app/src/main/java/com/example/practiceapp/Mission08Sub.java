package com.example.practiceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mission08Sub extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_08_sub);

        textView = findViewById(R.id.mission08TextView);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("menu").toString());

        Button toMenuButton = findViewById(R.id.mission08ToMenuButton);
        toMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("title", textView.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button toLoginButton = findViewById(R.id.mission08ToLoginButton);
        toLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("title", "toLogin");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}