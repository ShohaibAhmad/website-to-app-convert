package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class freelancer extends AppCompatActivity {
    private WebView freelancerWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer);
        Objects.requireNonNull(getSupportActionBar()).hide();
        freelancerWeb = findViewById(R.id.freelancerWeb);
        freelancerWeb.loadUrl("https://www.freelancer.com/");
       freelancerWeb.getSettings().setJavaScriptEnabled(true);
        freelancerWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (freelancerWeb.canGoBack()){
            freelancerWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}