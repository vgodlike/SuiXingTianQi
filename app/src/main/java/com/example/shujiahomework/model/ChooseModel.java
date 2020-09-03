package com.example.shujiahomework.model;

import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.presenter.ChoosePresenter;
import com.example.shujiahomework.httputli.HttpRetrofitUtil;

public class ChooseModel {
    ChoosePresenter choosePresenter;

    public ChooseModel(ChoosePresenter choosePresenter) {
        this.choosePresenter = choosePresenter;
    }

    /**
     * 根据城市名字请求城市天气信息
     */
    public void requestWeather(final String cityName) {
        HttpRetrofitUtil.sendWeatherRetrofitRequest(cityName, new retrofit2.Callback<Weather>() {
            @Override
            public void onResponse(retrofit2.Call<Weather> call, retrofit2.Response<Weather> response) {
                Weather weather = response.body();
                if (weather != null) {
                    choosePresenter.loadWeatherInfoSuccesss(weather);
                } else {
                    choosePresenter.loadWeatherFailure();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<Weather> call, Throwable t) {
                choosePresenter.loadWeatherFailure();
            }
        });
    }

    /**
     * 根据城市名字请求日出日落时间
     */
    public void requestSun(String cityName) {
        HttpRetrofitUtil.sendSunRetrofitRequest(cityName, new retrofit2.Callback<Sun>() {
            @Override
            public void onResponse(retrofit2.Call<Sun> call, retrofit2.Response<Sun> response) {
                Sun sun = response.body();
                if (sun != null) {
                    choosePresenter.loadSunInfoSuccess(sun);
                } else {
                    choosePresenter.loadSunFailure();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<Sun> call, Throwable t) {
                choosePresenter.loadSunFailure();
            }
        });
    }


    /**
     * 根据城市名字请求预警信息
     */
    public void requestAlarm(final String cityName) {
        HttpRetrofitUtil.sendAlarmRetrofitRequest(cityName, new retrofit2.Callback<Alarm>() {
            @Override
            public void onResponse(retrofit2.Call<Alarm> call, retrofit2.Response<Alarm> response) {
                Alarm alarm = response.body();
                if (alarm != null) {
                    choosePresenter.loadWarnInfoSuccess(alarm);
                } else {
                    choosePresenter.loadWarnFailure();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<Alarm> call, Throwable t) {
                choosePresenter.loadWarnFailure();
            }
        });
    }


}
