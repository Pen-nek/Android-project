package com.example.phonesample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {    // 액티비티의 기본 소양 : AppCompatActivity를 상속받을 것

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {      // 결과는 onCreate에서 받음
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();      // MainActivity에서 넘어온 intent 값을 받을 빈 intent
        String name = intent.getStringExtra("name");        // String을 받는 문법
        int age = intent.getIntExtra("age", 0);        // int를 받는 문법, 만약 넘어온 값이 없을 경우 값을 0으로 세팅하겠다

        TextView tv1 = findViewById(R.id.tv1);      // 메모리를 고려해 지역변수로 선언.
        TextView tv2 = findViewById(R.id.tv2);

        tv1.setText(name);
        tv2.setText(age + "");      // setText 매개변수로는 String 자료형만 가능. int를 setting 하려면 이런 문법을 사용해 String 타입으로 만들어야 함.
//        tv2.setText(Integer.toString(age));   // 이렇게도 String 타입(문자열)로 바꿀 수 있음
    }

}
