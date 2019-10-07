package com.example.quiztest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();      // MainActivity에서 넘어온 intent 값을 받을 빈 intent
        String answer = intent.getStringExtra("answer");        // String을 받는 문법

        TextView tvResult = findViewById(R.id.tvResult);      // 메모리를 고려해 지역변수로 선언

        tvResult.setText(answer);
    }
}
