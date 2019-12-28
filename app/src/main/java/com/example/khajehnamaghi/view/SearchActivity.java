package com.example.khajehnamaghi.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.khajehnamaghi.R;

public class SearchActivity extends AppCompatActivity {
    public static Intent newIntent(Context context) {
        return new Intent(context, SearchActivity.class);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.search_frag_containor, SearchFragment.newInstance())
                .commit();
    }
}
