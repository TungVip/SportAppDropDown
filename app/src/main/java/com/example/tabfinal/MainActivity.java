package com.example.tabfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.example.tabfinal.ScrollLeague.League;
import com.google.android.material.tabs.TabLayout;

import java.sql.Date;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);
        //getFragmentManager().beginTransaction().add(R.id.fragment_container, new fragment2(), "FRAGMENT_1").commit();

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        Fragment f1 = new fragment1();
        Fragment f2 = new fragment2();
        Fragment f3 = new fragment3();
        vpAdapter.addFragment(f1, "Home");
        vpAdapter.addFragment(f2, "League");
        vpAdapter.addFragment(f3, "Favorite");
        viewPager.setAdapter(vpAdapter);

    }
}