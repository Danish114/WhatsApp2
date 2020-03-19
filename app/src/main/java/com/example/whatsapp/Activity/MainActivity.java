package com.example.whatsapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.whatsapp.R;

public class MainActivity extends AppCompatActivity {

    private static final long SPLASH_SCREEN_TIME_OUT =1500 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {

                                          Intent Inntent = new Intent(MainActivity.this, TabLayoutActivity.class);
                                          startActivity(Inntent);
                                          finish();
                                      }

                                  }
                ,SPLASH_SCREEN_TIME_OUT
        );
    }
}
