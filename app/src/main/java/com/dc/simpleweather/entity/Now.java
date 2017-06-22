package com.dc.simpleweather.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zcits on 2017/6/22.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
