package com.example.conversortemperatura2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewPager);
        tabLayout.setupWithViewPager(viewPager);

       // VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager());
        vpAdapter.addFragment(new Fragment1(viewPager), "Celsius");
        vpAdapter.addFragment(new Fragment2(viewPager), "Fahrenheit");
        vpAdapter.addFragment(new Fragment3(viewPager), "Kelvin");
        vpAdapter.addFragment(new Fragment4(viewPager), "Rankine");
        viewPager.setAdapter(vpAdapter);


    }

}