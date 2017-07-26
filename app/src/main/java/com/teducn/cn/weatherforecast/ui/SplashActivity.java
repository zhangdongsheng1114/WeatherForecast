package com.teducn.cn.weatherforecast.ui;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.teducn.cn.weatherforecast.R;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView_Splash = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView_Splash = (ImageView) findViewById(R.id.image_splash);
        imageView_Splash.setBackgroundResource(R.drawable.weatherload);
        //获得作为图片背景的动画对象
        AnimationDrawable drawable = (AnimationDrawable) imageView_Splash.getBackground();
        drawable.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //实现activity的跳转
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}