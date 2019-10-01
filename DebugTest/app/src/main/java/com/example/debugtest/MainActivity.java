package com.example.debugtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{      // onCreate 내에 Button.onClickListener 임시 객체를 만들어서 onClick을 돌리는 방법도 있음

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);    // R.id.btn1 : btn1이라는 id를 가진 view 요소를 찾기 위해서 쓰는 문법
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();
        switch(v.getId()){
            case R.id.btn1:
                Toast.makeText(this, "btn1", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn2:
                Toast.makeText(this, "btn2", Toast.LENGTH_LONG).show();
                break;
        }
    }

        /*
    // 버튼 이벤트
    public void onBtnClick(View v) {
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();     // 토스트 메시지 : 잠깐 노출됐다가 사라지는 메시지
    }
    */
}
