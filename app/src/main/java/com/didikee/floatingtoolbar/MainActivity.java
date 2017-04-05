package com.didikee.floatingtoolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this,TestActivity.class));

        finish();
//        mWebView = ((WebView) findViewById(R.id.webView));
//
//        mWebView.loadUrl("file:///android_asset/Android Wikipedia.html");

    }
}
