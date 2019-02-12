package com.lucidastar.mysmallcircle.contract;

import com.lucidastar.mysmallcircle.base.BaseContract;
import com.lucidastar.mysmallcircle.model.LoginModel;

import io.reactivex.Flowable;
import retrofit2.http.Field;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public interface LoginContract {

        interface LoginView extends BaseContract.IBaseView<LoginPresenter> {
        String getUserName();

        String getPwd();

        void loginSuccess();

        void loginFail(String failMsg);
    }

    interface LoginPresenter<V extends LoginView> extends BaseContract.IBasePresenter {
        void login(String name, String pwd);

        void login1(String name, String pwd);
    }
}
