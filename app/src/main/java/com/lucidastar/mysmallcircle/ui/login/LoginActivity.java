package com.lucidastar.mysmallcircle.ui.login;

import android.os.Bundle;
import android.view.View;

import com.lucidastar.mysmallcircle.R;
import com.lucidastar.mysmallcircle.base.BaseActivity;
import com.lucidastar.mysmallcircle.contract.LoginContract;
import com.lucidastar.mysmallcircle.presenter.LoginPresenter;
import com.mine.lucidastarutils.utils.ToastUtils;

public class LoginActivity extends BaseActivity implements LoginContract.LoginView{

    LoginContract.LoginPresenter mLoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginPresenter = new LoginPresenter(this);
    }

    @Override
    protected void initView() {

    }


    public void openLogin(View view) {
        mLoginPresenter.login("","");
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPwd() {
        return null;
    }

    @Override
    public void loginSuccess() {
        ToastUtils.showLongToastSafe("登录成功");
    }

    @Override
    public void loginFail(String failMsg) {

    }

    @Override
    public void setPresenter(LoginContract.LoginPresenter presenter) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLoginPresenter.unsubscribe();
    }
}
