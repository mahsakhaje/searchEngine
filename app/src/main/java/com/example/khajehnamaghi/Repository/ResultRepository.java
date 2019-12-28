package com.example.khajehnamaghi.Repository;

import android.os.AsyncTask;
import android.util.Log;

import com.example.khajehnamaghi.network.RetrofitService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResultRepository {
    public static final String TAG = "tag";
    Retrofit mRetrofit;
    Map<String, String> mQueries;
    RetrofitService mService;
    Call mCall;
    public static final String BaseUrl = "https://www.googleapis.com/customsearch/v1/?key=AIzaSyBCFn1a_oTPYd97bQ8YfmAHnu8RbCyBbb8";
    public static final String KEY = "AIzaSyBCFn1a_oTPYd97bQ8YfmAHnu8RbCyBbb8";
    public static final String CX = "011226462358338131382:stbvqywnray";


    private static ResultRepository instance;

    public Call getmCall() {
        return mCall;
    }

    private ResultRepository(String query) {
        mQueries = new HashMap<String, String>();
        //mQueries.put("key", KEY);
        mQueries.put("cx", CX);
        if (query != null)
            mQueries.put("q", query);
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mService = mRetrofit.create(RetrofitService.class);
        mCall = mService.getResponse(mQueries);
    }

    public static ResultRepository getInstance(String query) {
        if (instance == null)
            instance = new ResultRepository(query);
        return instance;
    }

    public String getResult() {
        final String result = "";
        getmCall().enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                result.concat(response.body().toString());
                Log.d(TAG,result);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                result.concat("could not find ");
            }
        });

        Log.d(TAG, result);
        return result;
    }

}
