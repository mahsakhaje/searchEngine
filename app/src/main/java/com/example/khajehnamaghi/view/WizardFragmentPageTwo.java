package com.example.khajehnamaghi.view;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khajehnamaghi.R;
import com.example.khajehnamaghi.databinding.FragmentWizardFragmentPageTwoBinding;
import com.example.khajehnamaghi.viewModel.MyViewModel;


public class WizardFragmentPageTwo extends Fragment {

    FragmentWizardFragmentPageTwoBinding mBinding;
    MyViewModel mViewModel;

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
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_wizard_fragment_page_two, container, false);
        mBinding.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().startActivity(SearchActivity.newIntent(getActivity()));
            }
        });

        return mBinding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();

    }
}

