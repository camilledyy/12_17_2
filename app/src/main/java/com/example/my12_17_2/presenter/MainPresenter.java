package com.example.my12_17_2.presenter;

import com.example.my12_17_2.api.URLService;
import com.example.my12_17_2.base.BasePresenter;
import com.example.my12_17_2.bean.NewBean;
import com.example.my12_17_2.interfaces.ICallBack;
import com.example.my12_17_2.interfaces.MainInterface;
import com.example.my12_17_2.model.MainModel;

public class MainPresenter extends BasePresenter<MainInterface.View> implements MainInterface.Presenter {

    private final MainInterface.Model model;

    public MainPresenter() {
        model = new MainModel();
    }

    @Override
    public void getNew() {
        model.requestNew(URLService.New_list, new ICallBack<NewBean>() {
            @Override
            public void onSuccess(NewBean newBean) {
                
            }

            @Override
            public void onFail() {

            }
        });
    }
}
