package com.example.practiceapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    LinearLayout container;
    public static final int REQUEST_CODE_MENU = 101;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_MENU) {
            Toast.makeText(getApplicationContext(), "onActivityResult 메서드 호출됨. 호출코드: " + requestCode + ", 결과 코드: " + resultCode, Toast.LENGTH_SHORT).show();
        }

        if (resultCode == RESULT_OK) {
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(), "응답으로 전달된 name: " + name, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        container = findViewById(R.id.menuContainer);

        Button button2 = findViewById(R.id.menuButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ForResultActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        Button button = findViewById(R.id.menuButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.sub1, container, true);
                CheckBox checkBox = container.findViewById(R.id.subCheckBox);
                checkBox.setText("로딩되었어요.");
            }
        });
    }
}