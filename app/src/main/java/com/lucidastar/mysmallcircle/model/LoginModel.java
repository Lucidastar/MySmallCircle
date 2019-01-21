package com.lucidastar.mysmallcircle.model;

import com.lucidastar.mysmallcircle.mvp.IModel;

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
}
