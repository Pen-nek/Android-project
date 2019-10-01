package com.example.phonesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 객체 연결
        et_tel = findViewById(R.id.et_tel);
        et_tel.setText("Hello");

    }

    // 버튼 이벤트
    public void OnBtnClick(View v) {
        String data = et_tel.getText().toString();      // toString() : 받은 값을 문자열로 바꿔줌

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
        
    }
}
