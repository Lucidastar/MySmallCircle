package com.lucidastar.mysmallcircle.base;

import com.lucidastar.mysmallcircle.mvp.IView;

/**
 * Created by qiuyouzone on 2019/2/12.
 */

public class BasePresenter<V extends BaseContract.IBaseView> implements BaseContract.IBasePresenter{
    protected V mView;


    @Override
    public void attachView(BaseContract.IBaseView view) {

    }

    @Override
    public void detachView() {
        this.mView = null;
    }



    /**
     * View是否绑定
     *
     * @return
     */
    public boolean isViewAttached() {
        return mView != null;
    }
}
