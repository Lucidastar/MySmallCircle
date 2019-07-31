package com.lucidastar.mysmallcircle.app;

import android.app.Application;
import android.content.Context;

import com.mine.lucidastarutils.utils.Utils;
import com.umeng.commonsdk.UMConfigure;

/**
 * Created by qiuyouzone on 2018/9/25.
 */

public class MyApplication extends Application {
    public static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        UMConfigure.init(this, "5ba9f06cb465f52bb70000f5", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, null);
        Utils.init(mContext);
    }

    public static Context getAppContext() {
        return mContext.getApplicationContext();
    }
}
