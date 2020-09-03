package com.example.shujiahomework.apiInterface;

import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.bean.Lunar;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitService{
    @GET("weather/now.json")
    Call<Weather>getWeather(@Query("key")String key,
                          @Query("location")String location);
    @GET("weather/alarm.json")
    Call<Alarm>getAlarm(@Query("key")String key,
                        @Query("location")String location);
    @GET("geo/sun.json")
    Call<Sun>getSun(@Query("key")String key,
                    @Query("location")String location);
    @GET("life/chinese_calendar.json")
    Call<Lunar>getLunar(@Query("key")String key,
                        @Query("start")int start,
                        @Query("days")int days);
}
