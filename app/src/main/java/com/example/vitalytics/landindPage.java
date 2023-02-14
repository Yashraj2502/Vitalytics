package com.example.vitalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.vitalytics.ui.main.LandindPageFragment;

public class landindPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landind_page);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LandindPageFragment.newInstance())
                    .commitNow();
        }
    }
}