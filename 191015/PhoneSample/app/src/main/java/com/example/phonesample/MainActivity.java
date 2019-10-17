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

    }

    // 버튼 이벤트 (Button1)
    public void OnBtnClick(View v) {
        String data = et_tel.getText().toString();      // toString() : 받은 값을 문자열로 바꿔줌

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
        startActivity(intent);
    }

    // sub 이동 버튼 클릭 시 이벤트
    public void OnBtnClickSub(View v) {
        Intent intent = new Intent(this, SubActivity.class);    // 현재 액티비티에서, 섭액티비티로 가겠음
        intent.putExtra("name", "이혜민");     // 인텐트에다 다른 액티비티에 넘길 String 값을 저장
        intent.putExtra("age", 27);            // 인텐트에다 다른 액티비티에 넘길 int 값을 저장
        startActivity(intent);
    }

}
