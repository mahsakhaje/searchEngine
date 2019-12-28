package com.example.khajehnamaghi.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;

import com.example.khajehnamaghi.R;
import com.example.khajehnamaghi.databinding.ActivityMainBinding;

public class SplashActivity extends AppCompatActivity {
    public static final int DELAY_MILLIS = 2000;
    ActivityMainBinding mBinding;
    Drawable mDrawable;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mDrawable = mBinding.drawable.getDrawable();
        if (mDrawable instanceof Animatable)
            ((Animatable) mDrawable).start();
        goToNextPage();


    }

    private void goToNextPage() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = WizardActivity.newIntent(SplashActivity.this);
                startActivity(intent);
                finish();
            }
        }, DELAY_MILLIS);
    }
}