package com.example.spo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.cuberto.liquid_swipe.LiquidPager;

public class MainActivity extends AppCompatActivity {

    Animation topAnim, botAnim;
    ImageView imageView;
    TextView logo;

    private static int SPLASH_SCREEN= 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        botAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);




    imageView = findViewById(R.id.imageView);
    logo = findViewById(R.id.textView);


    imageView.setAnimation(topAnim);
    logo.setAnimation(botAnim);

    new Handler().postDelayed(new Runnable(){
        @Override
        public void run(){
            Intent intent=new Intent(MainActivity.this,liquidScreen.class);
            startActivity(intent);
            finish();
        }
    },SPLASH_SCREEN);

    }
}