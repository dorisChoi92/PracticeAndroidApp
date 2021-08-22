package com.example.practiceapp;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Main", "onAttach 실행");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Main", "onCreate 실행");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Main", "onStart 실행");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Main", "onResume 실행");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Main", "onPause 실행");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Main", "onStop 실행");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Main", "onDestroyView 실행");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Main", "onDestroy 실행");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_blank, container, false);

        Button button = rootView.findViewById(R.id.fragmentBlankButton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMainBlankActivity activity = (FragmentMainBlankActivity) getActivity();
                activity.onFragmentChanged(0);
            }
        });
        Log.d("Main", "onCreateView 실행");
        return rootView;
    }
}