package com.dc.simpleweather;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by zcits on 2017/6/22.
 */

public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
