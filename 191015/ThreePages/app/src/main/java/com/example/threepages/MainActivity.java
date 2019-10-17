package com.example.threepages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final TextView txtId = findViewById(R.id.txtId);
        final TextView txtPw = findViewById(R.id.txtPw);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String adminId = "admin";
                String adminPw = "1234";
                String gotId = txtId.getText().toString();
                String gotPw = txtPw.getText().toString();

                boolean checkIdPw = gotId.equals(adminId) && gotPw.equals(adminPw);

                if (checkIdPw) {
                    Intent intent = new Intent(getApplicationContext(), Menu.class);
                    startActivityForResult(intent, REQUEST_CODE_MENU);
                } else {
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 다시 확인해주세요.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        });
    }
}
