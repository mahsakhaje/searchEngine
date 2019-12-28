package com.example.khajehnamaghi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.khajehnamaghi.R;

public class SplashActivity extends AppCompatActivity {
    public static final int DELAY_MILLIS = 2000;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToNextPage();
    }
    private void goToNextPage(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= WizardActivity.newIntent(SplashActivity.this);
                startActivity(intent);
                finish();
            }
        }, DELAY_MILLIS);

    }
}
