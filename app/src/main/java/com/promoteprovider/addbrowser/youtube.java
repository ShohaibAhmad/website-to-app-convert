package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class youtube extends AppCompatActivity {
private WebView youtubeWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        Objects.requireNonNull(getSupportActionBar()).hide();
        youtubeWeb = findViewById(R.id.youtubeWeb);
        youtubeWeb.loadUrl("https://www.youtube.com/");
        youtubeWeb.getSettings().setJavaScriptEnabled(true);
        youtubeWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (youtubeWeb.canGoBack()){
            youtubeWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}