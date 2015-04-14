
package com.zhengsonglan.frescodemo.xml;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhengsonglan.frescodemo.R;


public class ReloadActivity extends ActionBarActivity implements View.OnClickListener {
    //initView
    Button bt_xml_reload;
    SimpleDraweeView simpleDraweeView;

    //initData
    Intent intent = new Intent();
    String uri="http://img4.imgtn.bdimg.com/it/u=3399249321,1109833355&fm=21&gp=0.jpg";
    String uri_failure="http://img4.imgtn.bdimg.com/it/u=3399249321,1109833355&fm";
    DraweeController draweeController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_xml_reload);
        initView();
        initEvent();
        initData();

    }




    //初始化view
    private void initView() {
        bt_xml_reload = (Button) findViewById(R.id.xml_bt_xml_reload);
        simpleDraweeView= (SimpleDraweeView) findViewById(R.id.xml_reload_iv_show);
    }

    private void initEvent() {
        bt_xml_reload.setOnClickListener(this);
    }

    private void initData() {
        draweeController= Fresco.newDraweeControllerBuilder()
                .setTapToRetryEnabled(true)
                .setUri(Uri.parse(uri_failure))
                .build();
    }
    //点击事件
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.xml_bt_xml_reload: {
                simpleDraweeView.setController(draweeController);
                break;
            }
        }
    }
}
