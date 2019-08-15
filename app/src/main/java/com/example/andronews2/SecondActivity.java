package com.example.andronews2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle argument = getIntent().getExtras();
        String name = argument.get("key").toString();

        webView = findViewById(R.id.activity_second);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(name);
    }
}
