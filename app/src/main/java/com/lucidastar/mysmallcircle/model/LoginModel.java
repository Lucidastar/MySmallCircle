package com.lucidastar.mysmallcircle.model;

import com.lucidastar.mysmallcircle.mvp.IModel;
import com.lucidastar.mysmallcircle.net.RetrofitManager;
import com.lucidastar.mysmallcircle.net.service.APIService;

import io.reactivex.Flowable;
import retrofit2.http.Field;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public class LoginModel implements IModel {

    public boolean login(String username, String pwd) {
        boolean isLogin = false;
        if ("gs".equals(username) && "123".equals(pwd)) {
            isLogin = true;
        } else {
            isLogin = false;
        }
        return isLogin;
    }

    @Override
    public void destroy() {

    }

    public Flowable<String> login1( String username,String password){
        return RetrofitManager.create(APIService.class).login(username,password);
    }
}
