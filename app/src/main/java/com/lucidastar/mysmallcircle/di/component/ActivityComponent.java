package com.lucidastar.mysmallcircle.di.component;

import android.app.Activity;
import android.content.Context;

import com.lucidastar.mysmallcircle.di.module.ActivityModule;
import com.lucidastar.mysmallcircle.di.scope.ContextLife;
import com.lucidastar.mysmallcircle.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by qiuyouzone on 2019/2/11.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();
}
