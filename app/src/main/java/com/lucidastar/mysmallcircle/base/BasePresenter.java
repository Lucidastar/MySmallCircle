package com.lucidastar.mysmallcircle.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;

import com.lucidastar.mysmallcircle.listener.NetConnectListener;
import com.lucidastar.mysmallcircle.mvp.IModel;
import com.lucidastar.mysmallcircle.mvp.IView;

import java.lang.ref.WeakReference;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public abstract class BasePresenter<M extends IModel, V extends IView> implements AbstractPresenter,NetConnectListener {
    private WeakReference actReference;
    protected V IView;
    protected M IModel;

    public M getIModel() {
        IModel = loadModel(); //使用前先进行初始化
        return IModel;
    }

    @Override
    public void attachView(IView iView) {
        actReference = new WeakReference(iView);
    }

    @Override
    public void detachView() {
        if (actReference != null) {
            actReference.clear();
            actReference = null;
        }
    }

    @Override
    public V getIView() {
        return (V) actReference.get();
    }

    public abstract M loadModel();


}
