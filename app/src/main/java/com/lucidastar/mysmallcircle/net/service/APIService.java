package com.lucidastar.mysmallcircle.net.service;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by qiuyouzone on 2019/2/12.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("user/login")
    Flowable<String> login(@Field("username") String username,
                           @Field("password") String password) ;
}
