package com.example.khajehnamaghi.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.khajehnamaghi.R;
import com.example.khajehnamaghi.databinding.ActivityWizardBinding;

public class WizardActivity extends AppCompatActivity {
    ViewPager mViewPager;
    ActivityWizardBinding mBinding;
    public final static int NUMBER_OF_PAGES = 2;
    ViewPagerAdaptor mAdapter;

    public static Intent newIntent(Context context) {
        return new Intent(context, WizardActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_wizard);
        mAdapter=new ViewPagerAdaptor(getSupportFragmentManager());
        mViewPager = mBinding.viewPager;
        mViewPager.setAdapter(mAdapter);

    }

    public class ViewPagerAdaptor extends FragmentPagerAdapter {

        public ViewPagerAdaptor(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FragmentWizardPageOne.newInstance();
                case 1:
                    return WizardFragmentPageTwo.newInstance();
            }
            return FragmentWizardPageOne.newInstance();
        }

        @Override
        public int getCount() {
            return NUMBER_OF_PAGES;
        }
    }
}
