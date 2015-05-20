package com.threewolftech.shiftplanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Thread to handle the splash activity
        new Handler().postDelayed(new Runnable() {

            //The thread starts
            public void run() {
                //Next Screen intent
                Intent i = new Intent(SplashScreen.this, Login.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}
