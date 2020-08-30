package com.example.shujiahomework.presenter;

import com.example.shujiahomework.bean.Lunar;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.model.MainModel;
import com.example.shujiahomework.view.MainView;

public class MainPresenter implements Presenter<MainView> {

    private MainView mainView;
    private MainModel mainModel;

    public MainPresenter(MainView view) {
        attachView(view);
        mainModel = new MainModel(this);
    }

    @Override
    public void attachView(MainView view) {
        this.mainView = view;
    }

    @Override
    public void detachView() {
        this.mainView = null;
    }

    public void loadWeatherFailure() {
        mainView.showWeatherFailure();
    }

    public void loadImage(String weatherText) {
        mainView.showImage(weatherText);
    }

    public void loadRefeshFailure() {
        mainView.showRefeshFailure();
    }

    public void loadWeatherInfoSuccesss(Weather weather) {
        mainView.showWeatherInfo(weather);
    }

    public void loadWeatherInfo(String cityName) {
        mainModel.requestWeather(cityName);
    }

    public void loadLunarFailure() {
        mainView.showLunarFailure();
    }

    public void loadLunarInfo() {
        mainModel.requestLunar();
    }

    public void loadLunarInfoSuccess(Lunar lunar) {
        mainView.showLunarInfo(lunar);
    }

    public void loadSunFailure() {
        mainView.showSunFailure();
    }

    public void loadSunInfo(String cityName) {
        mainModel.requestSun(cityName);
    }

    public void loadSunInfoSuccess(Sun sun) {
        mainView.showSunInfo(sun);
    }
}
