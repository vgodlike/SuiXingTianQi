package com.example.shujiahomework.view;

import com.example.shujiahomework.bean.Lunar;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;

public interface MainView  {

    void showImage(String weatherText);

    void showWeatherInfo(Weather weather);

    void showLunarInfo(Lunar lunar);

    void showSunInfo(Sun sun);

    void showWeatherFailure();

    void showRefeshFailure();

    void showLunarFailure();

    void showSunFailure();

}
