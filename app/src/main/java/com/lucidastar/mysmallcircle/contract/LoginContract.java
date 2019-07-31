package com.lucidastar.mysmallcircle.contract;

import com.lucidastar.mysmallcircle.base.BasePresenter;
import com.lucidastar.mysmallcircle.base.BaseView;
import com.lucidastar.mysmallcircle.mvp.IModel;

import io.reactivex.Observable;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public interface LoginContract {

    interface LoginView extends BaseView {
        String getUserName();

        String getPwd();

        void loginSuccess();

        void loginFail(String failMsg);
    }

    interface Model extends IModel {
        Observable<String> getUsers(int lastIdQueried, boolean update);
        boolean login(String name,String pwd);
    }
}
