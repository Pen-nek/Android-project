package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("hyemin", "Main : onCreate 호출됨");

        Button button = findViewById(R.id.btnGoSub);
        button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hyemin", "Main : onStart 호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hyemin", "Main : onRestart 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hyemin", "Main : onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hyemin", "Main : onDestroy 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hyemin", "Main : onPause 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hyemin", "Main : onResume 호출됨");
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SubActivity.class);     // 현재 액티비티에서, 다른 액티비티로 가겠음
        startActivity(intent);
    }
}
