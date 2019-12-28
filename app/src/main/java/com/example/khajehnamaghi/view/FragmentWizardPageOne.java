package com.example.khajehnamaghi.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khajehnamaghi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWizardPageOne extends Fragment {

    public static FragmentWizardPageOne newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentWizardPageOne fragment = new FragmentWizardPageOne();
        fragment.setArguments(args);
        return fragment;
    }
    public FragmentWizardPageOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_wizard_page_one, container, false);
    }

}
