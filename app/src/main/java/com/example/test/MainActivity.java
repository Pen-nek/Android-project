package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        LinearLayout mainLayout = new LinearLayout(this);
//        mainLayout.setOrientation(LinearLayout.VERTICAL);
//
//        LinearLayout.LayoutParams params =
//                new LinearLayout.LayoutParams(
//                        LinearLayout.LayoutParams.MATCH_PARENT,
//                        LinearLayout.LayoutParams.WRAP_CONTENT
//                );
//
//        Button button1 = new Button(this);
//        button1.setText("Button1");
//        button1.setLayoutParams(params);
//        mainLayout.addView(button1);
//
//        setContentView(mainLayout);


//        setContentView(R.layout.activity_main);   // 레이아웃이 되는 xml파일을 열어줌
        setContentView(R.layout.padding);
    }
}
