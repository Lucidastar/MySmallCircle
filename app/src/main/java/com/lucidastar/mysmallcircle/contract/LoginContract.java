package com.lucidastar.mysmallcircle.contract;

import com.lucidastar.mysmallcircle.base.BasePresenter;
import com.lucidastar.mysmallcircle.base.BaseView;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public interface LoginContract {

    interface LoginView extends BaseView<LoginPresenter> {
        String getUserName();

        String getPwd();

        void loginSuccess();

        void loginFail(String failMsg);
    }

    interface LoginPresenter extends BasePresenter {
        void login(String name, String pwd);

    }
}
