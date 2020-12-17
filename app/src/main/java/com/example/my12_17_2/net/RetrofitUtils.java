package com.example.my12_17_2.net;

import com.example.my12_17_2.api.ApiService;
import com.example.my12_17_2.api.IApiWorkInterface;
import com.example.my12_17_2.api.URLService;
import com.example.my12_17_2.interfaces.ICallBack;

import java.util.HashMap;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitUtils implements IApiWorkInterface {

    private static RetrofitUtils retrofitUtils;
    private final ApiService apiService;

    public static RetrofitUtils getInstance() {
        if (retrofitUtils == null)
            synchronized (RetrofitUtils.class) {
                if (retrofitUtils==null)
                    retrofitUtils=new RetrofitUtils();
            }
        return retrofitUtils;
    }

    public RetrofitUtils() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(URLService.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = build.create(ApiService.class);
    }

    @Override
    public <T> void get(String url, ICallBack<T> callBack) {

    }

    @Override
    public <T> void post(String url, ICallBack<T> callBack) {

    }

    @Override
    public <T> void post(String url, HashMap<String, String> map, ICallBack<T> callBack) {

    }
}
