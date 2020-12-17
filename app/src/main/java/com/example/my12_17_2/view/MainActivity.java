package com.example.my12_17_2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.my12_17_2.R;
import com.example.my12_17_2.base.BaseActivity;
import com.example.my12_17_2.bean.NewBean;
import com.example.my12_17_2.interfaces.MainInterface;
import com.example.my12_17_2.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainInterface.View {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    public void getNew(NewBean newBean) {

    }
}