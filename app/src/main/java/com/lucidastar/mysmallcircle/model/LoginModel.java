package com.lucidastar.mysmallcircle.model;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;

import com.lucidastar.mysmallcircle.base.BaseModel;
import com.lucidastar.mysmallcircle.contract.LoginContract;
import com.lucidastar.mysmallcircle.intergration.IRepositoryManager;
import com.lucidastar.mysmallcircle.mvp.IModel;
import com.lucidastar.mysmallcircle.net.RetrofitManager;
import com.lucidastar.mysmallcircle.net.service.APIService;
import com.mine.lucidastarutils.log.KLog;

import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import retrofit2.http.Field;

/**
 * Created by qiuyouzone on 2019/1/16.
 */

//这个是具体的实现
public class LoginModel extends BaseModel implements LoginContract.Model {

    public LoginModel() {
    }

    @Override
    public Observable<String> getUsers(int lastIdQueried, boolean update) {
        return Observable.just("success");
    }

    @Override
    public boolean login(String name, String pwd) {
        try {
            Thread.sleep(3000);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        KLog.i("onPause");
    }
}
