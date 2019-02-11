package com.lucidastar.mysmallcircle.di.module;

import android.app.Activity;
import android.content.Context;

import com.lucidastar.mysmallcircle.di.scope.ContextLife;
import com.lucidastar.mysmallcircle.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiuyouzone on 2019/2/11.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }
    @PerActivity
    @Provides
    @ContextLife("Activity")
    public Context provideActivityContext(){
        return mActivity;
    }
    @Provides
    @PerActivity
    public Activity provideActivity() {
        return mActivity;
    }
}
