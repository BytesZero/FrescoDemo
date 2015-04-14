
package com.zhengsonglan.frescodemo.xml;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.view.SimpleDraweeView;
import com.zhengsonglan.frescodemo.R;


public class XmlActivity extends ActionBarActivity implements View.OnClickListener {
    //initView
    Button bt_xml, bt_xml_failure;
    SimpleDraweeView simpleDraweeView;

    //initData
    Intent intent = new Intent();
    String uri = "http://img4.imgtn.bdimg.com/it/u=3399249321,1109833355&fm=21&gp=0.jpg";
    String uri_failure = "http://img4.imgtn.bdimg.com/it/u=3399249321,1109833355&fm";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_xml);
        initView();
        initEvent();


    }


    //初始化view
    private void initView() {
        bt_xml = (Button) findViewById(R.id.xml_bt_xml);
        bt_xml_failure = (Button) findViewById(R.id.xml_bt_xml_failure);
        simpleDraweeView = (SimpleDraweeView) findViewById(R.id.xml_iv_show);
    }

    private void initEvent() {
        bt_xml.setOnClickListener(this);
        bt_xml_failure.setOnClickListener(this);
    }

    //点击事件
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.xml_bt_xml: {
                simpleDraweeView.setImageURI(Uri.parse(uri));
                break;
            }
            case R.id.xml_bt_xml_failure: {
                simpleDraweeView.setImageURI(Uri.parse(uri_failure));
                break;
            }
        }
    }
}
