package com.example.quiztest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }
/*
    // 버튼 이벤트
    public void Onbtn1Click(View v) {
        Intent intent = new Intent(this, ResultActivity.class);    // 현재 액티비티에서, ResultActivity로 가겠음
        intent.putExtra("answer", "오답");     // 인텐트에다 다른 액티비티에 넘길 String 값을 저장
        startActivity(intent);
    }

    public void Onbtn2Click(View v) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("answer", "오답");
        startActivity(intent);
    }

    public void Onbtn3Click(View v) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("answer", "오답");
        startActivity(intent);
    }

    public void Onbtn4Click(View v) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("answer", "정답!!");
        startActivity(intent);
    }
*/
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ResultActivity.class);     // 현재 액티비티에서, ResultActivity로 가겠음
        if(v.getId() == R.id.btn4)
            intent.putExtra("answer", "정답!!");       // 인텐트에다 다른 액티비티에 넘길 String 값을 저장
        else
            intent.putExtra("answer", "오답");
        startActivity(intent);
    }
}
