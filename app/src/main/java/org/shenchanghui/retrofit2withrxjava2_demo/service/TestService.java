package org.shenchanghui.retrofit2withrxjava2_demo.service;

import org.shenchanghui.retrofit2withrxjava2_demo.bean.NewsBean;

import org.shenchanghui.retrofit2withrxjava2_demo.constance.AppConstance;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by shenc on 2017/7/17.
 */

public interface TestService {
    /**
     * 获取新闻  使用rxjava
     * @return
     */
    @POST(AppConstance.NEWS_URL)
    Observable<NewsBean> getNewsWithRxJava(@Query("key") String key, @Query("type") String type);

    /**
     * 获取新闻  不使用rxjava
     * @return
     */
    @POST(AppConstance.NEWS_URL)
    Call<ResponseBody> getNewsWithoutRxJava(@Query("key") String key, @Query("type") String type);
}
