package com.lucidastar.mysmallcircle.presenter;

import com.lucidastar.mysmallcircle.base.BasePresenter;
import com.lucidastar.mysmallcircle.contract.LoginContract;

public class LoginPresenter extends BasePresenter<LoginContract.Model, LoginContract.LoginView> {

    public LoginPresenter(LoginContract.Model model, LoginContract.LoginView rootView) {
        super(model, rootView);
    }

    public void login(){
        boolean login = mModel.login("", "");
        if (login){
            mRootView.loginSuccess();
        }
    }
}
