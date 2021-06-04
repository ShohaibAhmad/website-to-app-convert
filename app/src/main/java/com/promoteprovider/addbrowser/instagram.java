package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class instagram extends AppCompatActivity {
        private WebView instagramWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        Objects.requireNonNull(getSupportActionBar()).hide();
        instagramWeb =  findViewById(R.id.instagramWeb);
        instagramWeb.loadUrl("https://www.instagram.com/");
        instagramWeb.getSettings().setJavaScriptEnabled(true);
        instagramWeb.setWebViewClient(new WebViewClient());

        }
        public void onBackPressed(){
        if (instagramWeb.canGoBack()){
            instagramWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
        }

}