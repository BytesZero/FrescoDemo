
package com.zhengsonglan.frescodemo.xml;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhengsonglan.frescodemo.R;



public class GifActivity extends ActionBarActivity implements View.OnClickListener {
    //initView
    Button bt_xml_gif;
    SimpleDraweeView simpleDraweeView;

    //initData
    String uri="http://attach.bbs.miui.com/forum/201407/14/121215xscghf0ri9gyrgla.gif";

    DraweeController draweeController;
    Animatable animatable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_xml_gif);
        initView();
        initEvent();
        initData();

    }

    //��ʼ��view
    private void initView() {
        bt_xml_gif = (Button) findViewById(R.id.xml_bt_xml_gif);
        simpleDraweeView= (SimpleDraweeView) findViewById(R.id.xml_gif_iv_show);
    }

    private void initEvent() {
        bt_xml_gif.setOnClickListener(this);
    }

    private void initData() {
        draweeController= Fresco.newDraweeControllerBuilder()
                .setAutoPlayAnimations(true)
                .setUri(Uri.parse(uri))
                .build();
        //����Controller
        simpleDraweeView.setController(draweeController);
        animatable=draweeController.getAnimatable();
    }
    //����¼�
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.xml_bt_xml_gif: {

                    //�ж��Ƿ���������
                    if (animatable.isRunning()){
                        //�����У�ֹͣ
                        animatable.stop();
                    }else{
                        //ֹͣ�ˣ�����
                        animatable.start();
                    }
                break;
            }
        }
    }
}
