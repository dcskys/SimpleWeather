package com.dc.simpleweather.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zcits on 2017/6/22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime; //天气更新时间

    }



}
