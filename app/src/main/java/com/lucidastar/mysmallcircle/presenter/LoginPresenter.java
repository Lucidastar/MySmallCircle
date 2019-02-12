package com.lucidastar.mysmallcircle.presenter;

import android.support.annotation.NonNull;

import com.lucidastar.mysmallcircle.base.BaseContract;
import com.lucidastar.mysmallcircle.contract.LoginContract;
import com.lucidastar.mysmallcircle.model.LoginModel;
import com.lucidastar.mysmallcircle.net.RxScheduler;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public class LoginPresenter implements LoginContract.LoginPresenter<LoginContract.LoginView> {

    @NonNull
    private LoginContract.LoginView mLoginView;

    private LoginModel mLoginModel;

    @Inject
    public LoginPresenter() {
        mLoginModel = new LoginModel();
    }

    @Override
    public void login(String name, String pwd) {
        boolean login = mLoginModel.login(name, pwd);
        if (login){
            mLoginView.loginSuccess();
        }else {
            mLoginView.loginFail("登录失败");
        }
    }

    @Override
    public void login1(String name, String pwd) {
        mLoginView.showLoading();
        mLoginModel.login1(name,pwd).compose(RxScheduler.Flo_io_main()).as(mLoginView.bindAutoDispose()).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                mLoginView.hideLoading();
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mLoginView.onError(throwable);
            }
        });
    }


    @Override
    public void attachView(BaseContract.IBaseView view) {
        mLoginView = (LoginContract.LoginView) view;
    }

    @Override
    public void detachView() {
        if (mLoginView != null){
            mLoginView = null;
        }
    }


}
