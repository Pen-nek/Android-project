package com.example.baseballgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int dap1, dap2, dap3;
    int count;
    EditText et1, et2, et3;
    TextView tvCount, tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        tvResult = findViewById(R.id.tvResult);

        count = 0;
    }

    public void btnOnStart(View v) {    // View v를 꼭 받아와야 함
        // 1. 카운트 수 0일 경우
        if (count == 0) {
            // tvResult를 초기화한다
            tvResult.setText("");

            // 게임시작 관련 메시지 띄우기
            tvResult.setText("게임이 시작되었습니다. 빈 칸에 중복되지 않는 숫자 3개를 입력하고 확인을 눌러주세요.");

            // 랜덤 숫자 3개를 만든다 (중복 방지, while로 같을 경우 다시 랜덤 돌리게)
            dap1 = (int)(Math.random() * 9) + 1;
            dap2 = (int)(Math.random() * 9) + 1;
            dap3 = (int)(Math.random() * 9) + 1;

            while (dap2 == dap1)
                dap2 = (int)(Math.random() * 9) + 1;

            while (dap3 == dap2 || dap3 == dap1)
                dap3 = (int)(Math.random() * 9) + 1;

            System.out.println("답1:"+ dap1);
            System.out.println("답2:"+ dap2);
            System.out.println("답3:"+ dap3);
        }
        // 2. 카운트 수 1이상일 경우
        else
            // "진행중인 게임이 있습니다." 토스트 메시지 출력
            Toast.makeText(MainActivity.this, "진행중인 게임이 있습니다.", Toast.LENGTH_SHORT).show();
    }

    public void btnOnCheck(View v) {
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);

        // 1. 사용자가 입력한 값 3개를 받아온다
        int userNum1 = Integer.parseInt(et1.getText().toString());      // edittext에 적힌 값을 int로 받아오기
        int userNum2 = Integer.parseInt(et2.getText().toString());
        int userNum3 = Integer.parseInt(et3.getText().toString());

        int strike = 0;
        int ball = 0;

        // 2. 입력한 값과 숫자 3개를 비교한다
        if (dap1 == userNum1)
            strike++;
        else if (dap1 == userNum2 || dap1 == userNum3)
            ball++;

        if (dap2 == userNum2)
            strike++;
        else if (dap2 == userNum1 || dap2 == userNum3)
            ball++;

        if (dap3 == userNum3)
            strike++;
        else if (dap3 == userNum1 || dap3 == userNum2)
            ball++;

        // 3. 카운트 수 증가
        count++;
        tvCount.setText(count + "번째");

        // 4. 결과 스트링 생성
        String resultStr = "\n#" + count + " : ";

        // 3개 다 오답이면 결과에 "아웃" 저장
        if (strike == 0 && ball == 0)
            resultStr += "아웃";

        // 3개 다 정답이면 결과에 "성공" 저장하고 카운트 수 초기화
        else if (strike == 3) {
            resultStr += "성공!";
            count = 0;
        }

        // S나 B이 존재할 경우 결과에 S와 B의 수를 저장
        else
            resultStr += strike + "S, " + ball + "B";

        // 결과 메시지 출력
        if (tvResult.getText().toString() == null || tvResult.getText().toString() == "")
            tvResult.setText(resultStr);
        else
            tvResult.append(resultStr);

        // 카운트 수가 10일 경우 "기회 10회 전부 소진" 출력 후 카운트 수 초기화
        if (count == 10) {
            tvResult.append("\n기회 10회 전부 소진! 다시 게임시작 버튼을 눌러주세요.");
            count = 0;
            dap1 = 0;
            dap2 = 0;
            dap3 = 0;
        }

    }
}
