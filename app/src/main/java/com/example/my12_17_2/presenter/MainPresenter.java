package com.example.my12_17_2.presenter;

import com.example.my12_17_2.api.ICallBack;
import com.example.my12_17_2.base.BasePresenter;
import com.example.my12_17_2.bean.NewBean;
import com.example.my12_17_2.interfaces.MainInterface;
import com.example.my12_17_2.interfaces.URLService;
import com.example.my12_17_2.model.MainModel;

public class MainPresenter extends BasePresenter<MainInterface.View, MainInterface.Model> implements MainInterface.Presenter {


    @Override
    public void getNew() {
        IModel.requestNew(URLService.New_list, new ICallBack<NewBean>() {
            @Override
            public void onSuccess(NewBean newBean) {
                Iview.getNew(newBean);
            }

            @Override
            public void onFail() {

            }
        });
    }

    @Override
    protected MainModel getModel() {
        return new MainModel();
    }
}
