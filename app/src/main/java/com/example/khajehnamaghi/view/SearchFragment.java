package com.example.khajehnamaghi.view;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.khajehnamaghi.R;
import com.example.khajehnamaghi.databinding.FragmentSearchBinding;
import com.example.khajehnamaghi.viewModel.MyViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {
    FragmentSearchBinding mBinding;

    public static SearchFragment newInstance() {

        Bundle args = new Bundle();

        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false);
        final MyViewModel myViewModel = ViewModelProviders.of(getActivity()).get(MyViewModel.class);
        mBinding.searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isNetworkConnected()) {
                    Toast.makeText(getActivity(), "you should be online first", Toast.LENGTH_LONG).show();
                } else {
                    if (!mBinding.searchEt.getText().toString().isEmpty())
                        myViewModel.onSearchBtnClick(mBinding.searchEt.getText().toString());
                }
            }
        });

        return mBinding.getRoot();
    }

    public boolean isNetworkConnected() {
        ConnectivityManager conMgr = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();
        return netInfo != null &&
                netInfo.isConnectedOrConnecting();
    }

}
