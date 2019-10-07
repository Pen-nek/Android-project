package com.example.exchangesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etDollar;
    Button btnChange;
    TextView tvWon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDollar = findViewById(R.id.etDollar);
        btnChange = findViewById(R.id.btnChange);
        tvWon = findViewById(R.id.tvWon);
    }

    @Override
    public void onClick(View v) {
        String strDollar = etDollar.getText().toString();
        double dollar = Double.parseDouble(strDollar);

        double dRate = 1201.00;
        double won = dollar * dRate;

        String strWon = Double.toString(won);

        tvWon.setText(strWon);
    }

    @Override
    protected void onPause() {
        super.onPause();

        etDollar.setText("");
        tvWon.setText("");
    }
}
