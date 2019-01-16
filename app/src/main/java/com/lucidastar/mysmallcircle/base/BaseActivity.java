package com.lucidastar.mysmallcircle.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by qiuyouzone on 2018/9/25.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements View.OnClickListener, BaseView {
    /**
     * 将代理类通用行为抽出来
     */
    protected T mPresenter;

    /**
     * 布局的id
     */
    protected int mContentViewId;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initTheme();
        setContentView(mContentViewId);

        initToolbar();

        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenter != null) {
            mPresenter.subscribe();
        }
    }

    /**
     * 初始化主题
     */
    private void initTheme() {

    }

    private void initToolbar() {

    }


    protected ActionBar getToolbar() {
        return getSupportActionBar();
    }

    protected View getDecorView() {
        return getWindow().getDecorView();
    }

    protected abstract void initView();
}
