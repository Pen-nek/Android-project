package com.example.a576p;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a576p.R;

public class SelectActivity extends AppCompatActivity {

    SQLiteDatabase db;      // SQLite db 생성
    RecyclerView recyclerView;
    BookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new BookAdapter();

        selectRecord();
        recyclerView.setAdapter(adapter);   // 리사이클러뷰에게 이 아답터를 사용하라고 알려줌

    }

    public void OnBtnTabAdd(View v) {
        finish();
    }

    // DB 만들기
    public void createDB(){
        db = openOrCreateDatabase("books", MODE_PRIVATE, null);
    }

    // 레코드 조회
    public void selectRecord(){

        createDB();
        String sql = "SELECT * FROM books";

        Cursor cursor = db.rawQuery(sql, null);     // 쿼리의 결과 테이블을 관리. 여기서도 sql문 실행이 됨
        int cnt = cursor.getCount();

        for(int i=0; i<cnt; i++) {
            // 다음 레코드로 이동
            cursor.moveToNext();

            // 레코드 값 가져오기
            String title = cursor.getString(0);
            String writer = cursor.getString(1);
            String content = cursor.getString(2);

//            Book book = new Book(title, writer, content);

            Book book = new Book();
            book.setTitle(title);
            book.setWriter(writer);
            book.setContent(content);

            adapter.addItem(book);
        }

        cursor.close();
    }
}
