package com.lucidastar.mysmallcircle.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import com.lucidastar.mysmallcircle.listener.NetConnectListener;
import com.lucidastar.mysmallcircle.mvp.IModel;
import com.lucidastar.mysmallcircle.mvp.IView;

import java.lang.ref.WeakReference;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public abstract class BasePresenter<M extends IModel, V extends IView> implements AbstractPresenter {

    protected CompositeDisposable mCompositeDisposable;
    protected M mModel;
    protected V mRootView;


    @Override
    public void attachView(IView view) {
        if (mRootView != null && mRootView instanceof LifecycleOwner) {
            ((LifecycleOwner) mRootView).getLifecycle().addObserver(this);
            if (mModel!= null && mModel instanceof LifecycleObserver){
                ((LifecycleOwner) mRootView).getLifecycle().addObserver((LifecycleObserver) mModel);
            }
        }
        this.mRootView = (V) view;
    }


    @Override
    public IView getIView() {
        return mRootView;
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner owner) {
        detachView();
        owner.getLifecycle().removeObserver(this);
    }

    public void addDispose(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);//将所有 Disposable 放入容器集中处理
    }

    /**
     * 停止集合中正在执行的 RxJava 任务
     */
    public void unDispose() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();//保证 Activity 结束时取消所有正在执行的订阅
        }
    }
}
