package com.jackchen.architect_day03;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/3/19.
 */

public abstract class BaseSkinActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    protected abstract void changeSkin() ;
}
