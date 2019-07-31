package com.lucidastar.mysmallcircle.presenter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;

import com.lucidastar.mysmallcircle.contract.LoginContract;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public class LoginPresenter implements LoginContract.LoginPresenter{

    @NonNull
    private CompositeDisposable mCompositeDisposable;
    @NonNull
    LoginContract.LoginView mLoginView;

    public LoginPresenter(@NonNull LoginContract.LoginView loginView) {
        mLoginView = loginView;
        mCompositeDisposable = new CompositeDisposable();
        mLoginView.setPresenter(this);
    }

    @SuppressLint("CheckResult")
    @Override
    public void login(String name, String pwd) {
        Disposable disposable = Observable.timer(3000, TimeUnit.MILLISECONDS).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) throws Exception {
                mLoginView.loginSuccess();
            }
        });
        mCompositeDisposable.add(disposable);
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {
        mCompositeDisposable.dispose();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {

    }
}
