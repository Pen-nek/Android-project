package com.example.a576p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.a576p.R;

public class MainActivity extends AppCompatActivity {

    static SQLiteDatabase db;      // SQLite db 생성
    EditText etTitle;
    EditText etWriter;
    EditText etContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTitle = findViewById(R.id.etTitle);
        etWriter = findViewById(R.id.etWriter);
        etContent = findViewById(R.id.etContent);

        createDB();
        createTable();
    }

    // 버튼 이벤트 : 조회탭
    public void OnBtnTabSelect(View v) {
        Intent intent = new Intent(this, SelectActivity.class);
        startActivity(intent);
    }

    // 버튼 이벤트 : 추가
    public void OnBtnAdd(View v) {
        insertRecord();
    }

    // DB 만들기
    public void createDB(){
        db = openOrCreateDatabase("books", MODE_PRIVATE, null);
    }

    // 테이블 만들기
    public void createTable(){
        String sql = "CREATE TABLE if not exists books (title VARCHAR2(30), writer VARCHAR2(30), content VARCHAR2(300))";       // if not exists 꼭 넣어줄 것!!

        db.execSQL(sql);    // sql문 실행
    }

    // 레코드 추가
    public void insertRecord(){
        String title = etTitle.getText().toString();
        String writer = etWriter.getText().toString();
        String content = etContent.getText().toString();

        String sql = "INSERT INTO books VALUES ('" + title + "', '" + writer + "', '" + content + "')";

        db.execSQL(sql);
    }
}
