package com.example.spo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.cuberto.liquid_swipe.LiquidPager;

public class liquidScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN= 10000;
    LiquidPager pager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pager =findViewById(R.id.pager);

        adapter =new ViewPagerAdapter(getSupportFragmentManager(),1);
        pager.setAdapter(adapter);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent=new Intent(liquidScreen.this,uiDesign.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}