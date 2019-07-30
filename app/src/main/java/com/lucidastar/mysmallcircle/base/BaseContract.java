package com.lucidastar.mysmallcircle.base;

import com.lucidastar.mysmallcircle.mvp.IPresent;
import com.lucidastar.mysmallcircle.mvp.IView;
import com.uber.autodispose.AutoDisposeConverter;

/**
 * Created by qiuyouzone on 2019/2/12.
 */

public interface BaseContract {

    interface IBaseView<T> extends IView {
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


    interface IBasePresenter extends IPresent {

    }

}
