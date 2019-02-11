package com.lucidastar.mysmallcircle.di.module;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import com.lucidastar.mysmallcircle.di.scope.ContextLife;
import com.lucidastar.mysmallcircle.di.scope.PerFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiuyouzone on 2019/2/11.
 */
@Module
public class FragmentModule {
    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }
    @PerFragment
    @Provides
    @ContextLife("Activity")
    public Context provideActivityContext(){
        return mFragment.getActivity();
    }
    @Provides
    @PerFragment
    public Activity provideActivity(){
        return mFragment.getActivity();
    }
    @Provides
    @PerFragment
    public Fragment provideFragment(){
        return mFragment;
    }
}
