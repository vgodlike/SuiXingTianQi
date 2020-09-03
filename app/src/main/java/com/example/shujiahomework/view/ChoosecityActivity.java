package com.example.shujiahomework.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shujiahomework.R;
import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.presenter.ChoosePresenter;
import com.example.shujiahomework.utli.Check;
import com.example.shujiahomework.utli.Transform;
import com.example.shujiahomework.httputli.Utility;

public class ChoosecityActivity extends AppCompatActivity implements ChooseView {

    private String messsge;

    private Button backButton;

    private EditText editText;

    private TextView degreeText;

    private TextView cityText;

    private TextView licenseText;

    private TextView weatherText;

    private TextView sunriseText;

    private TextView sunsetText;

    private TextView alarmText;

    private LinearLayout alarmLayout;

    private ChoosePresenter choosePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosecity);
        initView();
    }

    private void initView() {
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        choosePresenter = new ChoosePresenter(this);
        backButton = findViewById(R.id.chooseback_button);
        editText = findViewById(R.id.edit_text);
        degreeText = findViewById(R.id.choosedegree_text);
        cityText = findViewById(R.id.choosecityname_text);
        weatherText = findViewById(R.id.weather_text);
        licenseText = findViewById(R.id.chooselicense_text);
        sunriseText = findViewById(R.id.choosesunrise_text);
        sunsetText = findViewById(R.id.choosesunset_text);
        alarmText = findViewById(R.id.choosealarm_text);
        alarmLayout = findViewById(R.id.choosealarm_layout);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoosecityActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        editText.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                    if (imm.isActive()) {
                        imm.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);
                    }
                }
                return false;
            }
        });
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        //这里注意要作判断处理，ActionDown、ActionUp都会回调到这里，不作处理的话就会调用两次
        if (KeyEvent.KEYCODE_ENTER == event.getKeyCode() && KeyEvent.ACTION_DOWN == event.getAction()) {
            messsge = editText.getText().toString();
            if (TextUtils.isEmpty(messsge)) {
//                    ToastUtil.showInfo(this, "请输入用户名", Toast.LENGTH_LONG);
                Toast.makeText(this, "请输入您想要查询的城市名或车牌号", Toast.LENGTH_SHORT).show();
                return false;
            }
            if (Check.isLetter(messsge)) {
                messsge = Transform.transformintoCity(messsge);
            }
            //处理事件
            choosePresenter.loadWarnInfo(messsge);
            choosePresenter.loadSunInfo(messsge);
            choosePresenter.loadWeatherInfo(messsge);
            showLicense(messsge);
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override
    public void showWeatherInfo(final Weather weather) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                degreeText.setText(weather.getResults().get(0).getNow().getTemperature() + "°");
                weatherText.setText(weather.getResults().get(0).getNow().getText());
            }
        });

    }

    @Override
    public void showSunInfo(Sun sun) {
        final String sunrise = sun.getResults().get(0).getSun().get(0).getSunrise();
        final String sunset = sun.getResults().get(0).getSun().get(0).getSunrise();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                sunriseText.setText("日出:" + sunrise);
                sunsetText.setText("日落:" + sunset);
            }
        });
    }

    @Override
    public void showWeatherFailure() {
        Toast.makeText(ChoosecityActivity.this, "获取天气信息失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSunFailure() {
        Toast.makeText(ChoosecityActivity.this, "获取日出日落信息失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showWarnInfo(final Alarm alarm) {
        final View view = LayoutInflater.from(this).inflate(R.layout.alarm_item, alarmLayout, false);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                alarmLayout.removeAllViews();
                if (alarm.getResults().get(0).getAlarms().size() != 0) {
                    for (Alarm.ResultsBean.AlarmsBean alarmsBean : alarm.getResults().get(0).getAlarms()) {
                        alarmText = view.findViewById(R.id.alarm_text);
                        alarmText.setText(alarmsBean.getTitle());
                        alarmLayout.addView(view);
                    }
                }
            }
        });
    }

    @Override
    public void showWarnFailure() {
        Toast.makeText(ChoosecityActivity.this, "获取预警信息失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLicense(final String cityName) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                cityText.setText(cityName);
                licenseText.setText("车牌号:" + Utility.handleLicenseWithCityname(cityName));
            }
        });
    }
}
