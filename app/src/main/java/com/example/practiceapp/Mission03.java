package com.example.practiceapp;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class Mission03 extends AppCompatActivity {
    ScrollView scrollView1;
    ScrollView scrollView2;
    ImageView imageView1;
    ImageView imageView2;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_03);

        scrollView1 = findViewById(R.id.mission03scrollView1);
        scrollView2 = findViewById(R.id.mission03scrollView2);
        imageView1 = findViewById(R.id.mission03imageView1);
        imageView2 = findViewById(R.id.mission03imageView2);
        scrollView2.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.sameple_image_001);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView1.setImageDrawable(bitmap);
        imageView1.getLayoutParams().width = bitmapWidth;
        imageView1.getLayoutParams().height = bitmapHeight;
    }

    public void onMission03Button1Clicked(View v) {
        changeImagePositionToUpperside();
    }

    public void onMission03Button2Clicked(View v) {
        changeImagePositionToLowerside();
    }

    private void changeImagePositionToUpperside() {
        imageView2.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.VISIBLE);

        imageView1.setImageDrawable(bitmap);
        imageView1.getLayoutParams().width = bitmap.getIntrinsicWidth();
        imageView1.getLayoutParams().height = bitmap.getIntrinsicHeight();
    }

    private void changeImagePositionToLowerside() {
        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmap.getIntrinsicWidth();
        imageView2.getLayoutParams().height = bitmap.getIntrinsicHeight();
    }
}