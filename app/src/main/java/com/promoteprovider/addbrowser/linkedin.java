package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class linkedin extends AppCompatActivity {
    private WebView linkedinWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);
        Objects.requireNonNull(getSupportActionBar()).hide();
        linkedinWeb = findViewById(R.id.linkedinWeb);
        linkedinWeb.loadUrl("https://www.linkedin.com/");
        linkedinWeb.getSettings().setJavaScriptEnabled(true);
        linkedinWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (linkedinWeb.canGoBack()){
            linkedinWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}