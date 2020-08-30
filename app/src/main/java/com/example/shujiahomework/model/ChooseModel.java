package com.example.shujiahomework.model;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.shujiahomework.application.MyApplication;
import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.presenter.ChoosePresenter;
import com.example.shujiahomework.utli.HttpUtil;
import com.example.shujiahomework.utli.Utility;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ChooseModel {
    ChoosePresenter choosePresenter;

    public ChooseModel(ChoosePresenter choosePresenter) {
        this.choosePresenter = choosePresenter;
    }

    /**
     * 根据城市名字请求城市天气信息
     */
    public void requestWeather(final String cityName) {

        String weatherUrl = "https://api.seniverse.com/v3/weather/now.json?key=SPtGqPQGSW4KGo8jP&location="
                + cityName + "&language=zh-Hans&unit=c#参数";
        HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
                choosePresenter.loadWeatherFailure();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String responseText = response.body().string();
                final Weather weather = Utility.handleWeatherResponse(responseText);
                if (weather != null) {
                    SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(MyApplication.getContext()).edit();
                    editor.putString("weather", responseText);
                    editor.apply();
                    choosePresenter.loadWeatherInfoSuccesss(weather);
                } else {
                    choosePresenter.loadWeatherFailure();
                }
            }
        });
    }

    /**
     * 根据城市名字请求日出日落时间
     */
    public void requestSun(String cityName) {

        String lunarUrl = "https://api.seniverse.com/v3/geo/sun.json?key=SPtGqPQGSW4KGo8jP&location=" + cityName + "&language=zh-Hans&start=0&days=1";
        HttpUtil.sendOkHttpRequest(lunarUrl, new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
                choosePresenter.loadSunFailure();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String responseText = response.body().string();
                final Sun sun = Utility.handleSunResponse(responseText);
                if (sun != null) {
                    choosePresenter.loadSunInfoSuccess(sun);
                } else {
                    choosePresenter.loadSunFailure();
                }
            }
        });
    }
    /**
     * 根据城市名字请求预警信息
     */
    public void requestAlarm(final String cityName) {

        String alarmUrl = "https://api.seniverse.com/v3/weather/alarm.json?key=SPtGqPQGSW4KGo8jP&location="
                + cityName;
        HttpUtil.sendOkHttpRequest(alarmUrl, new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
                choosePresenter.loadWarnFailure();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String responseText = response.body().string();
                final Alarm alarm = Utility.handleAlarmResponse(responseText);
                if (alarm != null) {
                    choosePresenter.loadWarnInfoSuccess(alarm);
                } else {
                    choosePresenter.loadWarnFailure();
                }
            }
        });
    }
}
