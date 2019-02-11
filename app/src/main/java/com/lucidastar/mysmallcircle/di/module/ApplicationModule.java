package com.lucidastar.mysmallcircle.di.module;

import android.content.Context;

import com.lucidastar.mysmallcircle.app.MyApplication;
import com.lucidastar.mysmallcircle.di.scope.ContextLife;
import com.lucidastar.mysmallcircle.di.scope.PerApp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiuyouzone on 2019/2/11.
 */
@Module
public class ApplicationModule {
    private MyApplication mApplication;

    public ApplicationModule(MyApplication application) {
        mApplication = application;
    }
    @Provides
    @PerApp
    @ContextLife("Application")
    public Context provideApplicationContext(){
        return mApplication.getApplicationContext();
    }
}
