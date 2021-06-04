package com.promoteprovider.addbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Objects;

public class Sites extends AppCompatActivity {
        private ImageView home,setting;
        private LinearLayout upwork,freelancer,fiverr,bongoAcademy,firebase,snapchat,youtube,facebook,instagram,linkedin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sites);
        Objects.requireNonNull(getSupportActionBar()).hide();
        home = findViewById(R.id.home);
        setting = findViewById(R.id.setting);

        upwork = findViewById(R.id.upwork);
        freelancer = findViewById(R.id.freelancer);
        fiverr = findViewById(R.id.fiverr);
        bongoAcademy = findViewById(R.id.bongoAcademy);
        firebase = findViewById(R.id.firebase);
        snapchat = findViewById(R.id.snapchat);
        youtube = findViewById(R.id.youtube);
        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);
        linkedin = findViewById(R.id.linkedin);







        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,MainActivity.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,Setting.class);
                startActivity(intent);
            }
        });



        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,instagram.class);
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,facebook.class);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,youtube.class);
                startActivity(intent);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,linkedin.class);
                startActivity(intent);
            }
        });

        snapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,snapchat.class);
                startActivity(intent);
            }
        });

        firebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,firebase.class);
                startActivity(intent);
            }
        });


        bongoAcademy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,bongoAcademy.class);
                startActivity(intent);
            }
        });


        fiverr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,fiverr.class);
                startActivity(intent);
            }
        });

        freelancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,freelancer.class);
                startActivity(intent);
            }
        });


        upwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sites.this,upwork.class);
                startActivity(intent);
            }
        });




    }
}