package com.example.practiceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mission08 extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 1001;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_08);

        editText1 = findViewById(R.id.mission08EditText1);
        editText2 = findViewById(R.id.mission08EditText2);

        Button button = findViewById(R.id.mission08LoginButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "아이디를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (editText2.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), Mission08Menu.class);
                    intent.putExtra("id", editText1.getText().toString());
                    intent.putExtra("pw", editText2.getText().toString());
                    startActivityForResult(intent, REQUEST_CODE_MENU);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_MENU) {
            if (data != null) {
                Toast.makeText(getApplicationContext(), "Result Code: " + resultCode, Toast.LENGTH_SHORT).show();
            }
        }
    }
}