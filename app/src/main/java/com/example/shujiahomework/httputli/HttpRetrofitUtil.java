package com.example.shujiahomework.httputli;

import com.example.shujiahomework.apiInterface.RetrofitService;
import com.example.shujiahomework.bean.Alarm;
import com.example.shujiahomework.bean.Lunar;
import com.example.shujiahomework.bean.Sun;
import com.example.shujiahomework.bean.Weather;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpRetrofitUtil {

    public static String key = "SPtGqPQGSW4KGo8jP";

    public static void sendWeatherRetrofitRequest(String location, Callback<Weather> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.seniverse.com/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<Weather> call = service.getWeather(key, location);
        call.enqueue(callback);
    }

    public static void sendAlarmRetrofitRequest(String location, Callback<Alarm> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.seniverse.com/v3/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create())).build();
        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<Alarm> call = service.getAlarm(key, location);
        call.enqueue(callback);
    }

    public static void sendLunarRetrofitRequest(Callback<Lunar> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.seniverse.com/v3/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create())).build();
        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<Lunar> call = service.getLunar(key,0,7);
        call.enqueue(callback);
    }

    public static void sendSunRetrofitRequest(String location, Callback<Sun> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.seniverse.com/v3/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create())).build();
        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<Sun> call = service.getSun(key, location);
        call.enqueue(callback);
    }
}
