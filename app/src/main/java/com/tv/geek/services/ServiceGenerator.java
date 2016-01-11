package com.tv.geek.services;

import com.tv.geek.model.Constant;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by wandywijayanto on 1/12/16.
 */
public class ServiceGenerator {

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(Constant.URL);
    private static OkHttpClient httpClient = new OkHttpClient();


    public static <S> S createService(Class<S> serviceClass)
    {
        Retrofit retrofit = builder.client(httpClient).build();
        return retrofit.create(serviceClass);
    }
}
