package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class snapchat extends AppCompatActivity {
        private WebView snapchatWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapchat);
        Objects.requireNonNull(getSupportActionBar()).hide();
        snapchatWeb =  findViewById(R.id.snapchatWeb);
        snapchatWeb.loadUrl("https://www.snapchat.com/");
        snapchatWeb.getSettings().setJavaScriptEnabled(true);
        snapchatWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (snapchatWeb.canGoBack()){
            snapchatWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}