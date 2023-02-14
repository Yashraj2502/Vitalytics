package com.example.vitalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Going to the landing page
                Intent intent = new Intent(MainActivity.this, landindPage.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        }, 22000); //  }, SPLASH_SCREEN);
    }
}