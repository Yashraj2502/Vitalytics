package com.example.vitalytics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

    Button oxygenSat = (Button) findViewById(R.id.buttonOxygen);
    oxygenSat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Set a On Click Performer for SPO2
            Intent goOxygen = new Intent(dashboard.this, oxygenLanding.class);
            startActivity(goOxygen);
        }
    });

    Button bloodPre = (Button) findViewById(R.id.buttonBlood);
    bloodPre.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Set a On Click Performer for Blood Pressure
            Intent goBlood = new Intent(dashboard.this, bloodPressure.class);
            startActivity(goBlood);
        }
    });

    Button heartRa = (Button) findViewById(R.id.buttonHeart);
    heartRa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Set a On Click Performer for Heart Rate
            Intent goHeart = new Intent(dashboard.this, heartRate.class);
            startActivity(goHeart);
        }
    });

    }
}
