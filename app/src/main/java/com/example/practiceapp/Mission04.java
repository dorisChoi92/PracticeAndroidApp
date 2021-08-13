package com.example.practiceapp;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mission04 extends AppCompatActivity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_04);

        editText = findViewById(R.id.mission04editText);
        textView = findViewById(R.id.mission04textView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                int textLength = editText.getText().length();
                textView.setText(textLength + " / 80 Bytes");
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    public void onMssion04Button1Clicked(View v) {
        Toast.makeText(this, editText.getText(), Toast.LENGTH_LONG).show();
    }
}