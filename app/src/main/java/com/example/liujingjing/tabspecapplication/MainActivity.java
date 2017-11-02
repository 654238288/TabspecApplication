package com.example.liujingjing.tabspecapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*得到选项卡*/
        TabHost.TabSpec tab1=getTabHost().newTabSpec("clear_cache").setIndicator("缓存清理");
        TabHost.TabSpec tab2=getTabHost().newTabSpec("sd_clear_cache").setIndicator("sd卡清理");

        //给选项卡设置内容
        tab1.setContent(new Intent(this,CacheClearActivity.class));
        tab2.setContent(new Intent(this,SdCacheClearActivity.class));

        getTabHost().addTab(tab1);
    }
}
