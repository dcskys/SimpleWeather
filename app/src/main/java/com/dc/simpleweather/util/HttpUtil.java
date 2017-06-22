package com.dc.simpleweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zcits on 2017/6/22.
 */

public class HttpUtil {


    /**
     * @param address
     * @param callback  同步请求  非 ui 线程
     */
    public static  void  sendOkHttpRequest(String address, okhttp3.Callback  callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }


}
