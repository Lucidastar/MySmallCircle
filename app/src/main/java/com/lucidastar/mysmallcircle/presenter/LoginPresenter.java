package com.lucidastar.mysmallcircle.presenter;

import android.support.annotation.NonNull;

import com.lucidastar.mysmallcircle.base.BasePresenter;
import com.lucidastar.mysmallcircle.contract.LoginContract;
import com.lucidastar.mysmallcircle.model.LoginModel;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public class LoginPresenter extends BasePresenter<LoginModel,LoginContract.LoginView> implements
        LoginContract.LoginPresenter {


    @NonNull
    private final LoginContract.LoginView mAddTaskView;
    @NonNull
    private CompositeDisposable mCompositeDisposable;

    public LoginPresenter(@NonNull LoginContract.LoginView addTaskView) {
        mAddTaskView = addTaskView;
        mCompositeDisposable = new CompositeDisposable();
        mAddTaskView.setPresenter(this);
    }



    @Override
    public void login(String name, String pwd) {

    }


    @Override
    public void detachView() {

    }
}
