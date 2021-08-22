package com.example.practiceapp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BlankMenuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Menu", "onCreateView 실행");
        return inflater.inflate(R.layout.fragment_blank_menu, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Menu", "onAttach 실행");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Menu", "onCreate 실행");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Menu", "onStart 실행");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Menu", "onResume 실행");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Menu", "onPause 실행");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Menu", "onStop 실행");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Menu", "onDestroyView 실행");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Menu", "onDestroy 실행");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Menu", "onDetach 실행");
    }
}