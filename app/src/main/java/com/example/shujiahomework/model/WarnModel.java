package com.example.shujiahomework.model;

import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.presenter.WarnPresenter;
import com.example.shujiahomework.httputli.HttpRetrofitUtil;

public class WarnModel {
    WarnPresenter warnPresenter;

    public WarnModel(WarnPresenter warnPresenter) {
        this.warnPresenter = warnPresenter;
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
                    warnPresenter.loadWarnInfoSuccess(alarm);
                } else {
                    warnPresenter.loadWarnFailure();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<Alarm> call, Throwable t) {
                warnPresenter.loadWarnFailure();
            }
        });
    }

}
