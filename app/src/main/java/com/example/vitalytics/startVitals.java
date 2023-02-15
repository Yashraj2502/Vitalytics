package com.example.vitalytics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class startVitals extends AppCompatActivity {
    private String user;
    private int p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.static_vital_scans);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            user = extras.getString("Usr");
            p = extras.getInt("Page");
        }

        ImageButton VS = this.findViewById(R.id.StartVS);

        VS.setOnClickListener(v -> {

            //switch is to decide which activity must be opened
            switch (p) {

                case 1: {
                    Intent i = new Intent(v.getContext(), heartLanding.class);
                    i.putExtra("Usr", user);
                    startActivity(i);
                    finish();
                }
                break;

                case 2: {
                    Intent i = new Intent(v.getContext(), bloodLanding.class);
                    i.putExtra("Usr", user);
                    startActivity(i);
                    finish();
                }
                break;

                case 3: {
                    Intent i = new Intent(v.getContext(), dashboard.class);
                    i.putExtra("Usr", user);
                    startActivity(i);
                    finish();
                }
                break;

                case 4: {
                    Intent i = new Intent(v.getContext(), oxygenLanding.class);
                    i.putExtra("Usr", user);
                    startActivity(i);
                    finish();
                }
                break;

                case 5: {
                    Intent i = new Intent(v.getContext(), dashboard.class);
                    i.putExtra("Usr", user);
                    startActivity(i);
                    finish();
                }
                break;
            }

        });
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(startVitals.this, dashboard.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}
