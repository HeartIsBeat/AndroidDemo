package com.wxm.androiddemo;

import android.app.Application;

import com.github.moduth.blockcanary.BlockCanary;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 在主进程初始化调用哈
        BlockCanary.install(this, new AppBlockCanaryContext()).start();
    }
}