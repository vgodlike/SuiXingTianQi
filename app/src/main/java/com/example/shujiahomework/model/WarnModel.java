package com.example.shujiahomework.model;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.shujiahomework.WarnActivity;
import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.presenter.WarnPresenter;
import com.example.shujiahomework.utli.HttpUtil;
import com.example.shujiahomework.utli.Utility;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class WarnModel {
    WarnPresenter warnPresenter;

    public WarnModel(WarnPresenter warnPresenter) {
        this.warnPresenter = warnPresenter;
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
                warnPresenter.loadWarnFailure();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String responseText = response.body().string();
                final Alarm alarm = Utility.handleAlarmResponse(responseText);
                if (alarm != null) {
                    warnPresenter.loadWarnInfoSuccess(alarm);
                } else {
                    warnPresenter.loadWarnFailure();
                }
            }
        });
    }
}
