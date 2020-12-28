package com.ukacademe.splashscreenusinggif;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    int SPLASH_TIME = 3000; //This is 3 second
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        //This Hide the ActionBar
        getSupportActionBar().hide();


        /* New Handler to start the Main-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Main-Activity. */
                Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
               startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
    }
}
