package com.lucidastar.mysmallcircle.di.component;

import android.app.Activity;
import android.content.Context;

import com.lucidastar.mysmallcircle.di.module.FragmentModule;
import com.lucidastar.mysmallcircle.di.scope.ContextLife;
import com.lucidastar.mysmallcircle.di.scope.PerFragment;

import dagger.Component;

/**
 * Created by qiuyouzone on 2019/2/11.
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getAcitivty();
}
