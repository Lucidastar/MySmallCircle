package com.lucidastar.mysmallcircle.ui.login;

import android.os.Bundle;
import android.view.View;

import com.lucidastar.mysmallcircle.R;
import com.lucidastar.mysmallcircle.base.BaseActivity;
import com.lucidastar.mysmallcircle.contract.LoginContract;
import com.lucidastar.mysmallcircle.presenter.LoginPresenter;
import com.lucidastar.mysmallcircle.model.LoginModel;
import com.mine.lucidastarutils.utils.ToastUtils;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.LoginView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected int initView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

    }


    public void openLogin(View view) {
        mPresenter.login();
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
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(new LoginModel(),this);
    }


}
