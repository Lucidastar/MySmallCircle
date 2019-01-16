/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lucidastar.mysmallcircle.base;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;

import com.lucidastar.mysmallcircle.listener.NetConnectListener;
import com.lucidastar.mysmallcircle.mvp.IPresent;
import com.lucidastar.mysmallcircle.mvp.IView;

public interface AbstractPresenter<V extends IView> extends IPresent,NetConnectListener{

    /**
     * @param view 绑定
     */
    void attachView(V view);
    /**
     * 防止内存的泄漏,清楚presenter与activity之间的绑定
     */
    void detachView();
    /**
     *
     * @return 获取View
     */
    IView getIView();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void connectListener();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void disconnectListener();


}
