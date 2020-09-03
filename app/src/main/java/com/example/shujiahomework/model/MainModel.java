package com.example.shujiahomework.model;

import com.example.shujiahomework.bean.Lunar;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.presenter.MainPresenter;
import com.example.shujiahomework.httputli.HttpRetrofitUtil;

public class MainModel {
    MainPresenter mainPresenter;

    public MainModel(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
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
                    mainPresenter.loadWeatherInfoSuccesss(weather);
                    mainPresenter.loadImage(weather.getResults().get(0).getNow().getText());
                } else {
                    mainPresenter.loadWeatherFailure();
                }
                mainPresenter.loadRefeshFailure();
            }

            @Override
            public void onFailure(retrofit2.Call<Weather> call, Throwable t) {
                mainPresenter.loadWeatherFailure();
                mainPresenter.loadRefeshFailure();
            }
        });
    }

    /**
     * 请求农历信息
     */
    public void requestLunar() {
        HttpRetrofitUtil.sendLunarRetrofitRequest(new retrofit2.Callback<Lunar>() {
            @Override
            public void onResponse(retrofit2.Call<Lunar> call, retrofit2.Response<Lunar> response) {
                Lunar lunar = response.body();
                if (lunar != null) {
                    mainPresenter.loadLunarInfoSuccess(lunar);
                } else {
                    mainPresenter.loadLunarFailure();
                }
                mainPresenter.loadRefeshFailure();
            }

            @Override
            public void onFailure(retrofit2.Call<Lunar> call, Throwable t) {
                mainPresenter.loadLunarFailure();
                mainPresenter.loadRefeshFailure();
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
                    mainPresenter.loadSunInfoSuccess(sun);
                } else {
                    mainPresenter.loadSunFailure();
                }
                mainPresenter.loadRefeshFailure();
            }

            @Override
            public void onFailure(retrofit2.Call<Sun> call, Throwable t) {
                mainPresenter.loadSunFailure();
                mainPresenter.loadRefeshFailure();
            }
        });
    }

}


