package com.test.callbackdemo;

/**
 * Created by zhoumao on 15/10/14.
 */
public class ZHOUMAO {
    OnZmListener onZmListener;

    public void zm(){
        onZmListener.OnZm(this);
    }

    public void setOnZmListener(OnZmListener onZmListener){
        this.onZmListener = onZmListener;
    }
}
