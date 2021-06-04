package com.example.spo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cuberto.liquid_swipe.LiquidPager;

public class liquidScreen extends AppCompatActivity {


    LiquidPager pager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid_screen);


        pager =findViewById(R.id.pager);

        adapter =new ViewPagerAdapter(getSupportFragmentManager(),1);
        pager.setAdapter(adapter);
    }
}