package com.example.practiceapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;

public class FragmentSeperateActivity extends AppCompatActivity implements FragmentList.ImageSelectionCallback {
    FragmentImageViewer imageViewerFragment;
    FragmentList listFragment;

    int[] images = {R.drawable.sameple_image_001, R.drawable.sameple_image_002, R.drawable.sameple_image_003};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_seperate);

        FragmentManager manager = getSupportFragmentManager();
        imageViewerFragment = (FragmentImageViewer) manager.findFragmentById(R.id.seperateFragment1);
        listFragment = (FragmentList) manager.findFragmentById(R.id.seperateFragment2);
    }

    @Override
    public void onImageSelected(int position) {
        imageViewerFragment.setImage(images[position]);
    }
}