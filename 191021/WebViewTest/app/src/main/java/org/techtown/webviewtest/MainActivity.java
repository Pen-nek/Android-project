package org.techtown.webviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 웹뷰 객체 얻어내기
        webView = findViewById(R.id.webview);

        // 외부 브라우저로 빠지지 않게 함
        webView.setWebViewClient(new WebViewClient());

        // 웹뷰 특정 url 접속하기
        String url = "https://google.com";
        webView.loadUrl(url);   // url을 로드하는 웹뷰의 함수

    }

    // Ctrl+O 누르면 불러올 수 있음
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // 키가 눌린 경우
        if(event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                // 핸드폰의 Back 키가 눌렸을 경우
                case KeyEvent.KEYCODE_BACK:
                    // 뒤로 갈 히스토리가 존재한다면
                    if(webView.canGoBack()) {
                        String url = webView.getUrl();
                        // 뒤로 가기 함
                        webView.goBack();
                    }
                    // 그렇지 않다면 앱을 화면에서 내려가게 함
                    else {
                        moveTaskToBack(true);
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    public void OnBtnMove(View v) {
        etUrl = findViewById(R.id.etUrl);

        String url = etUrl.getText().toString();
        webView.loadUrl(url);
    }
}
