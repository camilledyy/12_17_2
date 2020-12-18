package com.example.my12_17_2.model;

import com.example.my12_17_2.api.ICallBack;
import com.example.my12_17_2.interfaces.MainInterface;
import com.example.my12_17_2.net.RetrofitUtils;

public class MainModel implements MainInterface.Model {


    @Override
    public <T> void requestNew(String url, ICallBack<T> callBack) {
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
