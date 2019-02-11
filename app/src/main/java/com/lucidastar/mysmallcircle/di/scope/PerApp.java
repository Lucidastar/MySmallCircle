package com.lucidastar.mysmallcircle.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by qiuyouzone on 2019/2/11.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerApp {
}
