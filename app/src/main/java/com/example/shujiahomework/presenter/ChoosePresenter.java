package com.example.shujiahomework.presenter;

import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.model.ChooseModel;
import com.example.shujiahomework.view.ChooseView;
import com.example.shujiahomework.view.MainView;

public class ChoosePresenter implements Presenter<ChooseView> {
    private ChooseView chooseView;
    private ChooseModel chooseModel;

    public ChoosePresenter(ChooseView chooseView) {
        attachView(chooseView);
        chooseModel = new ChooseModel(this);
    }

    @Override
    public void attachView(ChooseView view) {
        this.chooseView = view;
    }

    @Override
    public void detachView() {
        this.chooseView = null;
    }

    public void loadWeatherFailure() {
        chooseView.showWeatherFailure();
    }

    public void loadWeatherInfoSuccesss(Weather weather) {
        chooseView.showWeatherInfo(weather);
    }

    public void loadWeatherInfo(String cityName) {
        chooseModel.requestWeather(cityName);
    }

    public void loadSunFailure() {
        chooseView.showSunFailure();
    }

    public void loadSunInfo(String cityName) {
        chooseModel.requestSun(cityName);
    }

    public void loadSunInfoSuccess(Sun sun) {
        chooseView.showSunInfo(sun);
    }

    public void loadWarnFailure() {
        chooseView.showWarnFailure();
    }

    public void loadWarnInfoSuccess(Alarm alarm) {
        chooseView.showWarnInfo(alarm);
    }

    public void loadWarnInfo(String cityName) {
        chooseModel.requestAlarm(cityName);
    }
}
