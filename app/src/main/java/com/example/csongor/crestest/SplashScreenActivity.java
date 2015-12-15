package com.example.csongor.crestest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Handler;

/**
 * Created by Csongor on 2015-12-14.
 */
public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent nextActivity = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(nextActivity);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
