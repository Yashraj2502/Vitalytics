package com.example.vitalytics;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class oxygenStaturation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new oxygenFragment()).commit();

        setContentView(R.layout.static_vital_scans);


    }
}
