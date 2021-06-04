package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class bongoAcademy extends AppCompatActivity {
    private WebView bongoAcademyWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bongo_academy);
        Objects.requireNonNull(getSupportActionBar()).hide();
        bongoAcademyWeb = findViewById(R.id.bongoAcademyWeb);
        bongoAcademyWeb.loadUrl("https://bongoacademy.com/");
        bongoAcademyWeb.getSettings().setJavaScriptEnabled(true);
        bongoAcademyWeb.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (bongoAcademyWeb.canGoBack()){
            bongoAcademyWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}