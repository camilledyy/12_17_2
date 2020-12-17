package com.example.my12_17_2.interfaces;

import com.example.my12_17_2.base.BaseView;
import com.example.my12_17_2.bean.NewBean;

public interface MainInterface {
    interface View extends BaseView {
        void getNew(NewBean newBean);
    }

    interface Presenter{
        void getNew();
    }

    interface Model{
        <T> void requestNew(String url,ICallBack<T> callBack);
    }
}
