package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class facebook extends AppCompatActivity {
    private WebView facebookWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        Objects.requireNonNull(getSupportActionBar()).hide();
        facebookWeb = findViewById(R.id.facebookWeb);
        facebookWeb.loadUrl("https://www.facebook.com/");
        facebookWeb.getSettings().setJavaScriptEnabled(true);
        facebookWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (facebookWeb.canGoBack()){
            facebookWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

}