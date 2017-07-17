package org.shenchanghui.retrofit2withrxjava2_demo.util;

import org.shenchanghui.retrofit2withrxjava2_demo.service.TestService;

import org.shenchanghui.retrofit2withrxjava2_demo.constance.AppConstance;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017-07-17.
 */

public class RetrofitUtil {
    private volatile static RetrofitUtil sInstance;
    private Retrofit mRetrofit;
    private TestService mTestService;
    private RetrofitUtil(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstance.APP_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        mTestService = mRetrofit.create(TestService.class);
    }
    public static RetrofitUtil getInstance(){
        if (sInstance == null){
            synchronized(RetrofitUtil.class){
                if (sInstance == null){
                    sInstance = new RetrofitUtil();
                }
            }
        }
        return sInstance;
    }
    public TestService getTestService(){
        return mTestService;
    }
}
