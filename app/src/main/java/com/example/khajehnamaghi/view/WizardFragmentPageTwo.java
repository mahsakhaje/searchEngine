package com.example.khajehnamaghi.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khajehnamaghi.R;


public class WizardFragmentPageTwo extends Fragment {


    public WizardFragmentPageTwo() {
        // Required empty public constructor
    }


    public static WizardFragmentPageTwo newInstance() {
        WizardFragmentPageTwo fragment = new WizardFragmentPageTwo();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wizard_fragment_page_two, container, false);
    }

}

