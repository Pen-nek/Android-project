package com.example.sqlitetest;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.tvInfo);

        createDB();
        createTable();
    }

    // 버튼 이벤트 : 추가
    public void OnBtnAdd(View v) {
        insertRecord();
    }

    // 버튼 이벤트 : 조회
    public void OnBtnShow(View v) {
        selectRecord();
    }

    // DB 만들기
    public void createDB(){
        db = openOrCreateDatabase("user", MODE_PRIVATE, null);
    }

    // 테이블 만들기
    public void createTable(){
        String sql = "create table if not exists user (id integer PRIMARY KEY autoincrement, name text, age integer, mobile text)";

        db.execSQL(sql);    // sql문 실행
    }

    // 레코드 추가
    public void insertRecord(){
        String sql = "insert into user (name, age, mobile) values ('Lee', 27, '010-1111-2222')";

        db.execSQL(sql);
    }

    // 레코드 조회
    public void selectRecord(){
        String sql = "select id, name, age, mobile from user";

        Cursor cursor = db.rawQuery(sql, null);     // 쿼리의 결과 테이블을 관리
        int cnt = cursor.getCount();

        for(int i=0; i<cnt; i++) {
            // 다음 레코드로 이동
            cursor.moveToNext();

            // 레코드 값 가져오기
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            int age = cursor.getInt(2);
            String mobile = cursor.getString(3);

            String str = "레코드#" + i + " : " + id + ", " + name + ", " + age + ", " + mobile;
            println(str);
        }
        cursor.close();
    }

    public void println(String str) {
        tvInfo.append(str + "\n");
    }
}

