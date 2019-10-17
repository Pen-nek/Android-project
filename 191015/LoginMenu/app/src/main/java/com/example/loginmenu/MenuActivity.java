package com.example.loginmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginmenu.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String a = btn1.getText().toString();   // 현재 선택된 메뉴의 이름을 받아오기
                Intent intent = new Intent();
                intent.putExtra("name", a);    // name의 값을 a로 넣음
                setResult(RESULT_OK, intent);   // intent 값을 파라미터로 전달
                finish();
            }
        });

        final Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String a = btn2.getText().toString();   // 현재 선택된 메뉴의 이름을 받아오기
                Intent intent = new Intent();
                intent.putExtra("name", a);    // name의 값을 a로 넣음
                setResult(RESULT_OK, intent);   // intent 값을 파라미터로 전달
                finish();
            }
        });

        final Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String a = btn3.getText().toString();   // 현재 선택된 메뉴의 이름을 받아오기
                Intent intent = new Intent();
                intent.putExtra("name", a);    // name의 값을 a로 넣음
                setResult(RESULT_OK, intent);   // intent 값을 파라미터로 전달
                finish();
            }
        });
    }
}
