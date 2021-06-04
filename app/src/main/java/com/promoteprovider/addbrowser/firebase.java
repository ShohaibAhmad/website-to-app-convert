package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class firebase extends AppCompatActivity {
        private WebView firebaseWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        Objects.requireNonNull(getSupportActionBar()).hide();
        firebaseWeb = findViewById(R.id.firebaseWeb);
        firebaseWeb.loadUrl("https://firebase.google.com/");
        firebaseWeb.getSettings().setJavaScriptEnabled(true);
        firebaseWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (firebaseWeb.canGoBack()){
            firebaseWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}