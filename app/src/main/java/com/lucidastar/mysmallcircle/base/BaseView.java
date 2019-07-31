package com.lucidastar.mysmallcircle.base;

import com.lucidastar.mysmallcircle.mvp.IView;

public interface BaseView<T> extends IView {
    void setPresenter(T presenter);
}
