package com.dc.simpleweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dc on 2017/6/22.\
 *
 *县表
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int countyCode;
    private  String  weatherId; //天气代码
    private int cityId;//城市索引

    public int getCityId() {

        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }
}
