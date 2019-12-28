package com.example.khajehnamaghi.network;

import org.json.JSONArray;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface RetrofitService {
    @GET(".")
    Call<JSONArray> getResponse(@QueryMap Map<String,String> queries);
}
