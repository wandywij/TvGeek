package com.tv.geek.Utils;

import javax.security.auth.callback.Callback;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wandywijayanto on 1/11/16.
 */
public interface API {

    @GET("/oauth/authorize")
    Call<Void> authorize();

}
