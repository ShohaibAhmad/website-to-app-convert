package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class upwork extends AppCompatActivity {
    private WebView upworkWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upwork);
        Objects.requireNonNull(getSupportActionBar()).hide();
        upworkWeb = findViewById(R.id.upworkWeb);
        upworkWeb.loadUrl("https://www.upwork.com/");
        upworkWeb.getSettings().setJavaScriptEnabled(true);
        upworkWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (upworkWeb.canGoBack()){
            upworkWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}