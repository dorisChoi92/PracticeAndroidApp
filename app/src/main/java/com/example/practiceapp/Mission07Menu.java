package com.example.practiceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mission07Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_07_menu);

        Button buttonCustom = findViewById(R.id.mission07ButtonCustom);
        buttonCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("menu", "고객 관리");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button buttonOutcome = findViewById(R.id.mission07ButtonOutcome);
        buttonOutcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("menu", "매출 관리");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button buttonMerchandise = findViewById(R.id.mission07ButtonMerchandise);
        buttonMerchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("menu", "상품 관리");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}