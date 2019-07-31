package com.lucidastar.mysmallcircle.base;

import com.lucidastar.mysmallcircle.mvp.IPresent;

/**
 * Created by qiuyouzone on 2019/2/12.
 */

public interface BasePresenter extends IPresent {
    void subscribe();
    void unsubscribe();
}
