package com.example.practiceapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class ToastActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast);

        editText1 = findViewById(R.id.toastEditText1);
        editText2 = findViewById(R.id.toastEditText2);

        textView = findViewById(R.id.toastTextView);

        Button button = findViewById(R.id.toastButton4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });
    }

    public void onToastButton1Clicked(View v) {
        try {
//            setGravity() shouldn't be called on text toasts, the values won't be used
//            running in API 29
            Toast toastView = Toast.makeText(this, "위치가 바뀐 토스트 메세지", Toast.LENGTH_LONG);
            int xOffset = Integer.parseInt(editText1.getText().toString());
            int yOffset = Integer.parseInt(editText2.getText().toString());

            toastView.setGravity(Gravity.TOP, xOffset, yOffset);
            toastView.show();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void onToastButton2Clicked(View v) {
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.toastborder, (ViewGroup) findViewById(R.id.toast_layout_root));
        TextView text = layout.findViewById(R.id.toastborderText);

        Toast toast = new Toast(this);
        text.setText("모양 바꾼 텍스트");
        toast.setGravity(Gravity.CENTER, 0, -100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    public void onToastButton3Clicked(View v) {
        Snackbar.make(v, "스낵바!!!!", Snackbar.LENGTH_LONG).show();
    }

    private void showMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("안내");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                String message = "\"예\" 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        builder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                String message = "\"취소\" 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = "\"아니오\" 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}