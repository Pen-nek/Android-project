package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{
    TextView tv;        // 텍스트뷰인 tv 객체 생성
    int a;
    int b;
    double c;
    int d;
    int inc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);     // id로 view객체를 찾겠다

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(this);

        Button btn_result = (Button)findViewById(R.id.btnSame);
        btn_result.setOnClickListener(this);
        Button btn_add = (Button)findViewById(R.id.btnPls);
        btn_add.setOnClickListener(this);
        Button btn_sub = (Button)findViewById(R.id.btnMins);
        btn_sub.setOnClickListener(this);
        Button btn_mul = (Button)findViewById(R.id.btnMtp);
        btn_mul.setOnClickListener(this);
        Button btn_div = (Button)findViewById(R.id.btnDvs);
        btn_div.setOnClickListener(this);
        Button btn_AC =(Button)findViewById(R.id.btnAc);
        btn_AC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn1 :
                tv.setText("1");
                if(inc == 0)
                    a = 1;
                else if(inc == 1) {
                    b = 1;
                }
                inc ++;
                break;

            case R.id.btn2 :
                tv.setText("2");
                if(inc == 0)
                    a = 2;
                else if(inc == 1) {
                    b = 2;
                }
                inc ++;
                break;

            case R.id.btn3 :
                tv.setText("3");
                if(inc == 0)
                    a = 3;
                else if(inc == 1) {
                    b = 3;
                }
                break;

            case R.id.btn4 :
                tv.setText("4");
                if(inc == 0)
                    a = 4;
                else if(inc == 1) {
                    b = 4;
                }
                break;

            case R.id.btn5 :
                tv.setText("5");
                if(inc == 0)
                    a = 5;
                else if(inc == 1) {
                    b = 5;
                }
                break;

            case R.id.btn6 :
                tv.setText("6");

                break;

            case R.id.btn7 :
                tv.setText("7");
                break;

            case R.id.btn8 :
                tv.setText("8");
                break;

            case R.id.btn9 :
                tv.setText("9");
                break;

            case R.id.btn0 :
                tv.setText("0");
                break;

            case R.id.btnPls:
                tv.setText("+");
                d = 1;
                break;
            case R.id.btnMins:
                tv.setText("-");
                d = 2;
                break;
            case R.id.btnMtp:
                tv.setText("*");
                d = 3;
                break;
            case R.id.btnDvs:
                tv.setText("/");
                d = 4;
                break;
            case R.id.btnSame :
                if(d == 1)
                    c = a + b;
                else if(d == 2)
                    c = a - b;
                else if(d == 3)
                    c = a * b;
                else if(d == 4)
                    c = a / b;
                tv.setText(Double.toString(c));
                break;

            case R.id.btnAc:
                tv.setText("");
                a = 0;
                b = 0;
                c = 0;
                d = 0;
        }
    }
}
