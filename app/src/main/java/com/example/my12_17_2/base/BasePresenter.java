package com.example.my12_17_2.base;

public abstract class BasePresenter<V extends BaseView,M extends BaseModel> {

    public V Iview;

    public M IModel;

    public void attachView(V iview) {
        Iview = iview;
        IModel=getModel();
    }

    public void deatchView(){
        Iview=null;
        IModel=null;
    }

    protected abstract M getModel();
}
