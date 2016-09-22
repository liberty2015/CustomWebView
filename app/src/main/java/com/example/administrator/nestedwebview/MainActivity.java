package com.example.administrator.nestedwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CustomWebView customWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customWebView= (CustomWebView) findViewById(R.id.webview);
        customWebView.loadUrl("https://segmentfault.com/a/1190000002873657");
    }
}
