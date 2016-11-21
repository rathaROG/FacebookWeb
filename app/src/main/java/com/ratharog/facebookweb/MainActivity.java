package com.ratharog.facebookweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();
    }

    private void start() {
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://m.facebook.com/");
    }
}
