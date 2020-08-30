package com.example.shujiahomework.view;

import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;

public interface ChooseView {
    void showWeatherInfo(Weather weather);

    void showSunInfo(Sun sun);

    void showWeatherFailure();

    void showSunFailure();

    void showWarnInfo(Alarm alarm);

    void showWarnFailure();

    void showLicense(String cityName);
}
