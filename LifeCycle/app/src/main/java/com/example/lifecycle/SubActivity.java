package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Log.d("hyemin", "Sub : onCreate 호출됨");

        Button button = findViewById(R.id.btnGoMain);
        button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hyemin", "Sub : onStart 호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hyemin", "Sub : onRestart 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hyemin", "Sub : onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hyemin", "Sub : onDestroy 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hyemin", "Sub : onPause 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hyemin", "Sub : onResume 호출됨");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);   // 현재 액티비티에서, 다른 액티비티로 가겠음
        startActivity(intent);
    }
}
