package com.lucidastar.mysmallcircle.presenter;

import android.view.View;

import com.lucidastar.mysmallcircle.base.BasePresenter;
import com.lucidastar.mysmallcircle.contract.LoginContract;
import com.mine.lucidastarutils.log.KLog;
import com.trello.rxlifecycle2.RxLifecycle;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.android.RxLifecycleAndroid;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends BasePresenter<LoginContract.Model, LoginContract.LoginView> {

    public LoginPresenter(LoginContract.Model model, LoginContract.LoginView rootView) {
        super(model, rootView);
    }

    public void login(){

        Observable<String> users = mModel.getUsers(1, true);
        users.delay(5000, TimeUnit.MILLISECONDS)
                .compose(RxLifecycleAndroid.bindView((View) mRootView))
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                if ("success".equals(s)){
                    mRootView.loginSuccess();
                    if (mRootView != null){

                    }else {
                        KLog.i("rootView is null");
                    }

                }
            }
        });
    }
}
