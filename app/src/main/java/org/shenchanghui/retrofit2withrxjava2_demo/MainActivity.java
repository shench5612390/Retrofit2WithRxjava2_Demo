package org.shenchanghui.retrofit2withrxjava2_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.shenchanghui.retrofit2withrxjava2_demo.bean.NewsBean;
import org.shenchanghui.retrofit2withrxjava2_demo.util.RetrofitUtil;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_get_news_with_rx_java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RetrofitUtil.getInstance().getTestService()
                        .getNewsWithRxJava("8bf17cf1c321723f060d5dc5c4da871a", "top")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<NewsBean>() {
                            private Disposable mDisposable;

                            @Override
                            public void onSubscribe(Disposable d) {
                                mDisposable = d;
                            }

                            @Override
                            public void onNext(NewsBean value) {
                                Toast.makeText(MainActivity.this, value.toString(), Toast.LENGTH_SHORT).show();
                                mDisposable.dispose();//注销
                            }

                            @Override
                            public void onError(Throwable e) {
                                Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                                mDisposable.dispose();//注销
                            }

                            @Override
                            public void onComplete() {

                            }
                        });

            }
        });
        findViewById(R.id.btn_get_news_without_rx_java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long time1 = System.currentTimeMillis();
                Call<ResponseBody> call = RetrofitUtil.getInstance().getTestService()
                        .getNewsWithoutRxJava("8bf17cf1c321723f060d5dc5c4da871a", "top");
                long time2 = System.currentTimeMillis();
                Log.e("MainActivity", "请求耗时：" + (time2 - time1) + "ms");
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String result = response.body().string();
                            Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
                            Log.e("MainActivity", "Thread.currentThread():" + Thread.currentThread());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
