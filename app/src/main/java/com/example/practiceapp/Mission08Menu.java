package com.example.practiceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mission08Menu extends AppCompatActivity {
    public static final int REQUEST_CODE_SUB = 1002;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_SUB) {
            if (data != null) {
                Toast.makeText(getApplicationContext(), "title: " + data.getStringExtra("title"), Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_08_menu);

        Button buttonCustom = findViewById(R.id.mission08ButtonCustom);
        buttonCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mission08Sub.class);
                intent.putExtra("menu", "고객 관리");
                startActivityForResult(intent, REQUEST_CODE_SUB);
            }
        });

        Button buttonOutcome = findViewById(R.id.mission08ButtonOutcome);
        buttonOutcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mission08Sub.class);
                intent.putExtra("menu", "매출 관리");
                startActivityForResult(intent, REQUEST_CODE_SUB);;
            }
        });

        Button buttonMerchandise = findViewById(R.id.mission08ButtonMerchandise);
        buttonMerchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mission08Sub.class);
                intent.putExtra("menu", "상품 관리");
                startActivityForResult(intent, REQUEST_CODE_SUB);;
            }
        });

        Button buttonLogin = findViewById(R.id.mission08ButtonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}