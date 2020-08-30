package com.example.shujiahomework.presenter;

import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.model.WarnModel;
import com.example.shujiahomework.view.MainView;
import com.example.shujiahomework.view.WarnView;

public class WarnPresenter implements Presenter<WarnView> {
    private WarnView warnView;
    private WarnModel warnModel;

    public WarnPresenter(WarnView warnView) {
        attachView(warnView);
        warnModel=new WarnModel(this);
    }

    @Override
    public void attachView(WarnView view) {
        this.warnView = view;
    }

    @Override
    public void detachView() {
        this.warnView = null;
    }

    public void loadWarnFailure(){
        warnView.showWarnFailure();
    }

    public void loadWarnInfoSuccess(Alarm alarm){
        warnView.showWarnInfo(alarm);
    }

    public void loadWarnInfo(String cityName){
        warnModel.requestAlarm(cityName);
    }

}
