package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
        private ImageView home,setting;
        private LinearLayout allSite,youtube,facebook,instagram,linkedin,youtube4,facebook4,instagram4,linkedin4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        home = findViewById(R.id.home);
        setting = findViewById(R.id.setting);
        allSite = findViewById(R.id.allSite);

        youtube = findViewById(R.id.youtube);
        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);
        linkedin = findViewById(R.id.linkedin);

        youtube4 = findViewById(R.id.youtube4);
        facebook4 = findViewById(R.id.facebook4);
        instagram4 = findViewById(R.id.instagram4);
        linkedin4 = findViewById(R.id.linkedin4);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Setting.class);
                startActivity(intent);
            }
        });

        allSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Sites.class);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,youtube.class);
                startActivity(intent);
            }
        });

        youtube4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,youtube.class);
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,facebook.class);
                startActivity(intent);
            }
        });

        facebook4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,facebook.class);
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,instagram.class);
                startActivity(intent);
            }
        });
        instagram4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,instagram.class);
                startActivity(intent);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,linkedin.class);
                startActivity(intent);
            }
        });

        linkedin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,linkedin.class);
                startActivity(intent);
            }
        });



    }
}