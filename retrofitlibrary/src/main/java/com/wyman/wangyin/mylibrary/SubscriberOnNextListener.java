package com.wyman.wangyin.mylibrary;
/**
 * Created by wy on 2016/11/18.
 *
 */
public interface SubscriberOnNextListener<T> {
    void onNext(T t);
    void onError(Throwable e);

}