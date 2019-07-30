package com.lucidastar.mysmallcircle.mvp;

import com.uber.autodispose.AutoDisposeConverter;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public interface IView {

    /**
     * 显示 loading
     */
    void showLoading();

    /**
     * 隐藏 loading
     */
    void hideLoading();
}
