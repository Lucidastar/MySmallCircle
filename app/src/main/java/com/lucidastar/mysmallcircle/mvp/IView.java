package com.lucidastar.mysmallcircle.mvp;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public interface IView {
    /**
     * 显示加载
     */
    default void showLoading() {

    }

    /**
     * 隐藏加载
     */
    default void hideLoading() {

    }
}
