package com.zhengsonglan.frescodemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.facebook.drawee.backends.pipeline.Fresco;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //≥ı ºªØfresco
        Fresco.initialize(MainActivity.this);

        setContentView(R.layout.activity_main);
    }

}
