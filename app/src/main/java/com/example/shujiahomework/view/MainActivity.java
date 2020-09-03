package com.example.shujiahomework.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.bumptech.glide.Glide;
import com.example.shujiahomework.R;
import com.example.shujiahomework.bean.Lunar;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.example.shujiahomework.presenter.MainPresenter;
import com.example.shujiahomework.httputli.Utility;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    public String cityName;

    public LocationClient mLocationClient;

    public SwipeRefreshLayout swipeRefreshLayout;

    private TextView longitudeText;

    private TextView latitudeText;

    private TextView locationText;

    private TextView provinceText;

    private TextView cityText;

    private TextView districtText;

    private TextView sunriseText;

    private TextView sunsetText;

    private TextView degreeText;

    private TextView licenseText;

    private TextView lunardateText;

    private TextView lunaryearText;

    private Button warnButton;

    private Button chooseButton;

    private Button moreButton;

    private ImageView weatherImageView;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        mainPresenter = new MainPresenter(this);
        mLocationClient = new LocationClient(getApplicationContext());
        mLocationClient.registerLocationListener(new MyLocationListener());
        longitudeText = findViewById(R.id.longitude_text);
        latitudeText = findViewById(R.id.latitude_text);
        locationText = findViewById(R.id.location_text);
        provinceText = findViewById(R.id.province_text);
        cityText = findViewById(R.id.city_text);
        districtText = findViewById(R.id.district_text);
        sunriseText = findViewById(R.id.sunrise_text);
        sunsetText = findViewById(R.id.sunset_text);
        degreeText = findViewById(R.id.degree_text);
        warnButton = findViewById(R.id.warn_button);
        licenseText = findViewById(R.id.license_text);
        lunardateText = findViewById(R.id.lunardate_text);
        lunaryearText = findViewById(R.id.lunaryear_text);
        swipeRefreshLayout = findViewById(R.id.swipe_refresh);
        chooseButton = findViewById(R.id.choose_button);
        moreButton=findViewById(R.id.more_button);
        weatherImageView = findViewById(R.id.bing_pic_img);
        swipeRefreshLayout.setColorSchemeColors(Color.parseColor("#00CCFF"), Color.parseColor("#00CCFF"));
        List<String> permissionList = new ArrayList<>();
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            permissionList.add(Manifest.permission.ACCESS_FINE_LOCATION);
        }
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permissionList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            permissionList.add(Manifest.permission.READ_PHONE_STATE);
        }
        if (!permissionList.isEmpty()) {
            String[] permissions = permissionList.toArray(new String[permissionList.size()]);
            ActivityCompat.requestPermissions(MainActivity.this, permissions, 1);
        } else {
            requestLocation();
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mainPresenter.loadWeatherInfo(cityName);
                mainPresenter.loadSunInfo(cityName);
                mainPresenter.loadLunarInfo();
            }
        });
        warnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WarnActivity.class);
                intent.putExtra("cityname", cityName);
                startActivity(intent);
                finish();
            }
        });
        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChoosecityActivity.class);
                startActivity(intent);
                finish();
            }
        });
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "正在开发中...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void requestLocation() {
        initLocation();
        mLocationClient.start();
    }

    private void initLocation() {
        LocationClientOption option = new LocationClientOption();
        option.setIsNeedAddress(true);
        option.setScanSpan(5000);
        mLocationClient.setLocOption(option);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissons, int[] grantResults) {
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0) {
                    for (int result : grantResults) {
                        if (result != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(this, "必须同意所有权限才能使用本程序", Toast.LENGTH_SHORT).show();
                            finish();
                            return;
                        }
                    }
                    requestLocation();
                } else {
                    Toast.makeText(this, "发生未知错误", Toast.LENGTH_SHORT).show();
                    finish();
                }
                break;
            default:
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
        mLocationClient.stop();
    }

    public class MyLocationListener implements BDLocationListener {

        @Override
        public void onReceiveLocation(final BDLocation location) {
            cityName = location.getCity();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mainPresenter.loadLunarInfo();
                    mainPresenter.loadWeatherInfo(cityName);
                    mainPresenter.loadSunInfo(cityName);
                    licenseText.setText("车牌号:" + Utility.handleLicenseWithCityname(cityName));
                    longitudeText.setText("经度:" + location.getLongitude());
                    latitudeText.setText("纬度:" + location.getLatitude());
                    locationText.setText(location.getStreet());
                    provinceText.setText(location.getProvince());
                    cityText.setText(cityName);

                    districtText.setText(location.getDistrict());
                }
            });
        }
    }

    @Override
    public void showImage(final String weatherText) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (weatherText.equals("晴") || weatherText.equals("晴间多云") || weatherText.equals("大部多云") || weatherText.equals("多云")) {
                    Glide.with(MainActivity.this).load(R.drawable.sunny).into(weatherImageView);
                } else if (weatherText.equals("阴") || weatherText.equals("强沙尘暴") || weatherText.equals("沙尘暴") || weatherText.equals("扬沙") || weatherText.equals("浮尘")) {
                    Glide.with(MainActivity.this).load(R.drawable.cloudy).into(weatherImageView);
                } else if (weatherText.equals("暴雨") || weatherText.equals("大雨") || weatherText.equals("中雨") || weatherText.equals("小雨") || weatherText.equals("阵雨")) {
                    Glide.with(MainActivity.this).load(R.drawable.rainy).into(weatherImageView);
                } else if (weatherText.equals("暴雪") || weatherText.equals("大雪") || weatherText.equals("中雪") || weatherText.equals("小雪") || weatherText.equals("阵雪") || weatherText.equals("雨夹雪")) {
                    Glide.with(MainActivity.this).load(R.drawable.snowy).into(weatherImageView);
                } else if (weatherText.equals("雷阵雨伴有冰雹") || weatherText.equals("雷阵雨")) {
                    Glide.with(MainActivity.this).load(R.drawable.thunder).into(weatherImageView);
                } else {
                    Glide.with(MainActivity.this).load(R.drawable.sunny).into(weatherImageView);
                }
            }
        });

    }

    @Override
    public void showWeatherInfo(Weather weather) {
        final String degree = weather.getResults().get(0).getNow().getTemperature();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                degreeText.setText(degree + "°");
            }
        });

    }

    @Override
    public void showLunarInfo(final Lunar lunar) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Lunar.ResultsBean resultsBean = lunar.getResults();
                Lunar.ResultsBean.ChineseCalendarBean chineseCalendarBean = resultsBean.getChinese_calendar().get(0);
                lunardateText.setText("农历日:" + chineseCalendarBean.getLunar_month_name() + chineseCalendarBean.getLunar_day_name());
                lunaryearText.setText("农历年:" + chineseCalendarBean.getGanzhi_year() + "年");
            }
        });

    }

    @Override
    public void showSunInfo(Sun sun) {
        final String sunrise = sun.getResults().get(0).getSun().get(0).getSunrise();
        final String sunset = sun.getResults().get(0).getSun().get(0).getSunset();
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
        Toast.makeText(MainActivity.this, "获取天气信息失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showRefeshFailure() {
        swipeRefreshLayout.setRefreshing(false);//传入false表示刷新事件结束，从而隐藏刷新进度条
    }

    @Override
    public void showLunarFailure() {
        Toast.makeText(MainActivity.this, "获取农历信息失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSunFailure() {
        Toast.makeText(MainActivity.this, "获取日出日落信息失败", Toast.LENGTH_SHORT).show();
    }
}
