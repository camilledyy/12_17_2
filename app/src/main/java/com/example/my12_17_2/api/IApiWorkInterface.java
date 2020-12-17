package com.example.my12_17_2.api;

import com.example.my12_17_2.interfaces.ICallBack;

import java.util.HashMap;

public interface IApiWorkInterface {
    <T> void get(String url, ICallBack<T> callBack);
    <T> void post(String url, ICallBack<T> callBack);
    <T> void post(String url, HashMap<String,String> map, ICallBack<T> callBack);
}
