package com.example.my12_17_2.interfaces;

public interface ICallBack<T> {
    void onSuccess(T t);
    void onFail();
}
