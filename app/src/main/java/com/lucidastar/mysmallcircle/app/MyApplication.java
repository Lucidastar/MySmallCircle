package com.lucidastar.mysmallcircle.app;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by qiuyouzone on 2018/9/25.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this, "5ba9f06cb465f52bb70000f5", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, null);
    }
}
