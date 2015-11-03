package com.test.callbackdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZHOUMAO zhoumao = new ZHOUMAO();
        zhoumao.setOnZmListener(new OnZmListener() {
            @Override
            public void OnZm(ZHOUMAO zhoumao) {
                Log.i("zm","ZHOUMAO IS HERE");
            }
        });

        zhoumao.zm();
    }



}
