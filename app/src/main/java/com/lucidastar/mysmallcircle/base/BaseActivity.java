package com.lucidastar.mysmallcircle.base;


import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.AutoDisposeConverter;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import javax.inject.Inject;


/**
 * Created by qiuyouzone on 2018/9/25.
 */

public abstract class BaseActivity<T extends BaseContract.IBasePresenter> extends AppCompatActivity implements View.OnClickListener, BaseContract.IBaseView {
    /**
     * 将代理类通用行为抽出来
     */
    @Inject
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


    @Override
    public AutoDisposeConverter<T> bindAutoDispose() {
        return AutoDispose.autoDisposable(AndroidLifecycleScopeProvider
                .from((LifecycleOwner) this, Lifecycle.Event.ON_DESTROY));
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }
}
