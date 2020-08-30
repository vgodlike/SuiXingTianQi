package com.example.shujiahomework.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shujiahomework.R;
import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.presenter.WarnPresenter;

public class WarnActivity extends AppCompatActivity implements WarnView {

    private LinearLayout alarmLayout;

    private String cityName;

    private TextView warnText;

    private TextView alarmText;

    private Button backButton;

    private Button shareButton;

    private WarnPresenter warnPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn);
        initView();
    }

    private void initView() {
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            warnPresenter = new WarnPresenter(this);
            alarmLayout = findViewById(R.id.alarm_layout);
            warnText = findViewById(R.id.warn_text);
            shareButton = findViewById(R.id.share_button);
            Intent intent = getIntent();
            cityName = intent.getStringExtra("cityname");
            backButton = findViewById(R.id.warnback_button);
            warnPresenter.loadWarnInfo(cityName);
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(WarnActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
            shareButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(WarnActivity.this, "正在开发中...", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        warnPresenter.detachView();
    }

    @Override
    public void showWarnInfo(final Alarm alarm) {
        final View view = LayoutInflater.from(this).inflate(R.layout.alarm_item, alarmLayout, false);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                warnText.setText(cityName + "预警");
                alarmLayout.removeAllViews();
                if (alarm.alarmsBeanList.size() != 0) {
                    for (Alarm.ResultsBean.AlarmsBean alarmsBean : alarm.alarmsBeanList) {
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
        Toast.makeText(WarnActivity.this, "获取预警信息失败", Toast.LENGTH_SHORT).show();
    }
}
