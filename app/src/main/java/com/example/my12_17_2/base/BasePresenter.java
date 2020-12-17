package com.example.my12_17_2.base;

public abstract class BasePresenter<T> {

    public T Iview;

    public void attachView(T iview) {
        Iview = iview;
    }
}
