package com.lucidastar.mysmallcircle.di.component;

import android.content.Context;

import com.lucidastar.mysmallcircle.di.module.ApplicationModule;
import com.lucidastar.mysmallcircle.di.scope.ContextLife;
import com.lucidastar.mysmallcircle.di.scope.PerApp;

import dagger.Component;

/**
 * Created by qiuyouzone on 2019/2/11.
 */
@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getApplication();
}
