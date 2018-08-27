package com.jackchen.architect_day03;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/3/19 21:56
 * Version 1.0
 * Params:
 * Description:    这里只是随便写2个方法，用于演示UML画图
*/

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView() ;
        initData() ;
    }

    protected abstract void initData();


    protected abstract void initView();
}
