package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2018/5/11.
 */

public class BingPic {
    @SerializedName("images")
    public List<BaseBingPic> images;

    public class BaseBingPic{
        @SerializedName("url")
        public String bingBasePicUrl;
        @SerializedName("enddate")
        public String endDate;
        @SerializedName("startdate")
        public String startDate;
    }
}
