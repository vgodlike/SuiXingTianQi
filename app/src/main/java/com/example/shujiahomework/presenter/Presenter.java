package com.example.shujiahomework.presenter;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();
}
