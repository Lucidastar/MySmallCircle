package com.lucidastar.mysmallcircle.base;

import com.uber.autodispose.AutoDisposeConverter;

/**
 * Created by qiuyouzone on 2019/2/12.
 */

public interface BaseContract {

    interface IBaseView<T> {
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

        /**
         * 数据获取失败
         *
         * @param throwable
         */
        void onError(Throwable throwable);

        <T> AutoDisposeConverter<T> bindAutoDispose();

    }


    interface IBasePresenter<V extends IBaseView> {
        /**
         * @param view 绑定
         */
        void attachView(V view);

        /**
         * 防止内存的泄漏,清楚presenter与activity之间的绑定
         */
        void detachView();

    }

}
