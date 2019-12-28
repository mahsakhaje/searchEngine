package com.example.khajehnamaghi.view;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khajehnamaghi.R;
import com.example.khajehnamaghi.databinding.FragmentFragmentWizardPageOneBinding;
import com.example.khajehnamaghi.viewModel.MyViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWizardPageOne extends Fragment {
    FragmentFragmentWizardPageOneBinding mBinding;
    MyViewModel myViewModel;

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
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_fragment_wizard_page_one, container, false);

        mBinding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                (  (WizardActivity) getActivity()).mViewPager.setCurrentItem(2);
                (  (WizardActivity) getActivity()).getmAdapter().notifyDataSetChanged();

            }
        });
        return mBinding.getRoot();
    }

}
