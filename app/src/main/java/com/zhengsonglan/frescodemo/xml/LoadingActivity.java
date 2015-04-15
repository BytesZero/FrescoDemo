
package com.zhengsonglan.frescodemo.xml;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.view.SimpleDraweeView;
import com.zhengsonglan.frescodemo.R;


public class LoadingActivity extends ActionBarActivity implements View.OnClickListener {
    //initView
    Button bt_xml_loading;
    SimpleDraweeView simpleDraweeView;

    //initData
    String uri="http://p2.gexing.com/kongjianpifu/20120823/1643/5035ed21483f6.jpg";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_xml_loading);
        initView();
        initEvent();
        initData();

    }

    //初始化view
    private void initView() {
        bt_xml_loading = (Button) findViewById(R.id.xml_bt_xml_loading);
        simpleDraweeView= (SimpleDraweeView) findViewById(R.id.xml_loading_iv_show);
    }

    private void initEvent() {
        bt_xml_loading.setOnClickListener(this);
    }

    private void initData() {

    }
    //点击事件
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.xml_bt_xml_loading: {
                    simpleDraweeView.setImageURI(Uri.parse(uri));
                break;
            }
        }
    }
}
