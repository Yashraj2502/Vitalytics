package com.example.vitalytics;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


import com.google.android.material.tabs.TabLayout;

public class oxygyen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.oxygen);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPage = (ViewPager) findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
//        simpleFragmentPagerAdapter adapter = new simpleFragmentPagerAdapter(oxygyen.this, getSupportFragmentManager());
        simpleFragmentPagerAdapter adapter = new simpleFragmentPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        // Set the adapter onto the view pager
//        adapter.addFragment(new Fragment(), R.string.oxy);
//        adapter.addFragment(new Fragment(), R.string.hist);
        viewPage.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPage);

        // Find the TextView that shows the CURRENT-STATE category
        TextView cur =(TextView) findViewById(R.id.current);

        //Set a Click Listener on that view
        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentIntent = new Intent(oxygyen.this, oxygenStaturation.class);
                startActivity(currentIntent);
            }
        });


        }

    }
