package com.example.shujiahomework.model;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.shujiahomework.MainActivity;
import com.example.shujiahomework.R;
import com.example.shujiahomework.WarnActivity;
import com.example.shujiahomework.app.MyApp;
import com.example.shujiahomework.application.MyApplication;
import com.example.shujiahomework.bean.Lunar;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.presenter.MainPresenter;
import com.example.shujiahomework.utli.HttpUtil;
import com.example.shujiahomework.utli.Utility;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainModel {
    MainPresenter mainPresenter;

    public MainModel(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
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
                mainPresenter.loadWeatherFailure();
                mainPresenter.loadRefeshFailure();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String responseText = response.body().string();
                final Weather weather = Utility.handleWeatherResponse(responseText);
                String weatherText = weather.getNow().getText();
                mainPresenter.loadImage(weatherText);
                if (weather != null) {
                    SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(MyApplication.getContext()).edit();
                    editor.putString("weather", responseText);
                    editor.apply();
                    mainPresenter.loadWeatherInfoSuccesss(weather);
                } else {
                    mainPresenter.loadWeatherFailure();
                }
                mainPresenter.loadRefeshFailure();
            }
        });
    }

    /**
     * 请求农历信息
     */
    public void requestLunar() {

        String lunarUrl = "https://api.seniverse.com/v3/life/chinese_calendar.json?key=SPtGqPQGSW4KGo8jP&start=0&days=7";
        HttpUtil.sendOkHttpRequest(lunarUrl, new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
                mainPresenter.loadLunarFailure();
                mainPresenter.loadRefeshFailure();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String responseText = response.body().string();
                final Lunar lunar = Utility.handleLunarResponse(responseText);
                if (lunar != null) {
                    SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(MyApplication.getContext()).edit();
                    editor.putString("alarm", responseText);
                    editor.apply();
                    mainPresenter.loadLunarInfoSuccess(lunar);
                } else {
                    mainPresenter.loadLunarFailure();
                }
                mainPresenter.loadRefeshFailure();
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
                mainPresenter.loadSunFailure();
                mainPresenter.loadRefeshFailure();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String responseText = response.body().string();
                final Sun sun = Utility.handleSunResponse(responseText);
                if (sun != null) {
                    mainPresenter.loadSunInfoSuccess(sun);
                } else {
                    mainPresenter.loadSunFailure();
                }
                mainPresenter.loadRefeshFailure();
            }
        });
    }
}


