package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class fiverr extends AppCompatActivity {
private WebView fiverrWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiverr);
        Objects.requireNonNull(getSupportActionBar()).hide();
        fiverrWeb = findViewById(R.id.fiverrWeb);
        fiverrWeb.loadUrl("https://www.fiverr.com/");
        fiverrWeb.getSettings().setJavaScriptEnabled(true);
        fiverrWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (fiverrWeb.canGoBack()){
            fiverrWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}