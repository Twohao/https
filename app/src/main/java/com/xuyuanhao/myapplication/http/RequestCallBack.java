package com.xuyuanhao.myapplication.http;

/**
 * Created by Mr.xu on 2016/3/8.
 */
public interface RequestCallBack {

    public void onSuccess(String result, int requestCode);

    public void onFailure(String error);

    public void error(Exception ex) ;
}
