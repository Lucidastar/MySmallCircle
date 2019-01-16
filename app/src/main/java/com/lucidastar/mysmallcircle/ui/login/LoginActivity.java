package com.lucidastar.mysmallcircle.ui.login;

import android.os.Bundle;
import android.view.View;

import com.lucidastar.mysmallcircle.R;
import com.lucidastar.mysmallcircle.base.BaseActivity;
import com.lucidastar.mysmallcircle.contract.LoginContract;
import com.lucidastar.mysmallcircle.mvp.IPresent;

public class LoginActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void initView() {

    }


    @Override
    public void onClick(View v) {

    }


    @Override
    public void setPresenter(IPresent presenter) {

    }
}
