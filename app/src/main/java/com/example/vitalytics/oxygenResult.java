package com.example.vitalytics;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class oxygenResult extends AppCompatActivity {
    private String user, Date;
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    java.util.Date today = Calendar.getInstance().getTime();
    int O2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_oxygen);

        getSupportActionBar().hide();

        ((TextView)findViewById(R.id.name)).setText(Html.fromHtml("SPO<sub>2</sub>"));

        Date = df.format(today);
        TextView RO2 = this.findViewById(R.id.dynamicValue);
//        ImageButton SO2 = this.findViewById(R.id.SendO2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            O2 = bundle.getInt("O2R");
            user = bundle.getString("Usr");
            RO2.setText(String.valueOf(O2));
        }


    }

    @Override
    public void onBackPressed() {

        Intent i = new Intent(oxygenResult.this, dashboard.class);
        i.putExtra("Usr", user);
        startActivity(i);
        finish();
        super.onBackPressed();

    }
}
