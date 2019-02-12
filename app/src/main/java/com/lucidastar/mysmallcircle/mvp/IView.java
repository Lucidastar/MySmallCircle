package com.lucidastar.mysmallcircle.mvp;

import com.uber.autodispose.AutoDisposeConverter;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

public interface IView {
    /**
     * 绑定Android生命周期 防止RxJava内存泄漏
     *
     * @param <T>
     * @return
     */
    <T> AutoDisposeConverter<T> bindAutoDispose();

}
