package com.lucidastar.mysmallcircle.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lucidastar.mysmallcircle.R;

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

    /**
     * Toolbar标题
     */
    private int mToolbarTitle;

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
//        if (this instanceof NewsActivity) {
//            setTheme(SpUtil.readBoolean("enableNightMode") ? R.style.BaseAppThemeNight_LauncherAppTheme : R.style.BaseAppTheme_LauncherAppTheme);
//        } else if (!mEnableSlidr && mHasNavigationView) {
//            setTheme(SpUtil.readBoolean("enableNightMode") ? R.style.BaseAppThemeNight_AppTheme : R.style.BaseAppTheme_AppTheme);
//        } else {
//            setTheme(SpUtil.readBoolean("enableNightMode") ? R.style.BaseAppThemeNight_SlidrTheme : R.style.BaseAppTheme_SlidrTheme);
//        }
    }

    private void initToolbar() {

        // 针对父布局非DrawerLayout的状态栏处理方式
        // 设置toolbar上面的View实现类状态栏效果，这里是因为状态栏设置为透明的了，而默认背景是白色的，不设的话状态栏处就是白色
//        final View statusView = findViewById(R.id.status_view);
//        if (statusView != null) {
//            statusView.getLayoutParams().height = MeasureUtil.getStatusBarHeight(this);
//        }
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        if (toolbar != null) {
//            // 24.0.0版本后导航图标会有默认的与标题的距离，这里设置去掉
//            toolbar.setContentInsetStartWithNavigation(0);
//            setSupportActionBar(toolbar);
//            if (getSupportActionBar() != null) {
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            }
//            if (mToolbarTitle != -1) {
//                setToolbarTitle(mToolbarTitle);
//            }
//            if (mToolbarIndicator != -1) {
//                setToolbarIndicator(mToolbarIndicator);
//            } else {
//                setToolbarIndicator(R.drawable.ic_menu_back);
//            }
//        }
    }

    protected void setToolbarIndicator(int resId) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeAsUpIndicator(resId);
        }
    }

    protected void setToolbarTitle(String str) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(str);
        }
    }

    protected void setToolbarTitle(int strId) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(strId);
        }
    }

    protected ActionBar getToolbar() {
        return getSupportActionBar();
    }

    protected View getDecorView() {
        return getWindow().getDecorView();
    }

    protected abstract void initView();
}
