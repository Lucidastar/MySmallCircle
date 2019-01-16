package com.lucidastar.mysmallcircle.contract;

import com.lucidastar.mysmallcircle.base.AbstractPresenter;
import com.lucidastar.mysmallcircle.base.BasePresenter;
import com.lucidastar.mysmallcircle.base.BaseView;
import com.lucidastar.mysmallcircle.mvp.IPresent;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public interface LoginContract {

        interface LoginView extends BaseView<AbstractPresenter> {
        String getUserName();

        String getPwd();

        void loginSuccess();

        void loginFail(String failMsg);
    }

    interface LoginPresenter extends AbstractPresenter{
        void login(String name, String pwd);
    }
}
