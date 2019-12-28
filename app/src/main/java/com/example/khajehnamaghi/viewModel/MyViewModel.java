package com.example.khajehnamaghi.viewModel;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.khajehnamaghi.Repository.ResultRepository;

public class MyViewModel extends AndroidViewModel {

    ResultRepository mRepository;
    private MutableLiveData<Boolean> mNextButtonState = new MutableLiveData<>();

    public MyViewModel(@NonNull Application application) {
        super(application);
        mNextButtonState.setValue(false);
    }

    public MutableLiveData<Boolean> getmNextButtonState() {
        return mNextButtonState;
    }

    public void setmNextButtonState(boolean b) {
        mNextButtonState.setValue(b
        );
    }

    public void onSearchBtnClick(String query) {

        mRepository = ResultRepository.getInstance(query);
        mRepository.getResult();


    }
}
