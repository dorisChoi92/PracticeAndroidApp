package com.example.practiceapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LinearCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 안드로이드의 UI객체는 Context객체를 전달받도록 되어 있음 (AppCompatActivity는 Context를 상속함)
        // => Context를 상속받지 않은 클래스에서 Context객체를 전달해야 한다면 getApplicationContext 메서드 호출하여 앱에서 참조가능한 Context 객체를 사용하면 됨
        // 프로그래밍 언어에서 Context란 객체의 정보를 담고 있는 객체를 의미
        // 안드로이드는 UI 구성 요소인 뷰에 대한 정보를 손쉽게 ㅎ
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        Button button1 = new Button(this);
        button1.setText("madeButton");
        button1.setLayoutParams(params);
        linearLayout.addView(button1);

        setContentView(linearLayout);
    }
}