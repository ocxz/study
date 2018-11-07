package com.study.cxz.mystu_11_7.Application;

import android.app.Application;
import android.graphics.Typeface;

/**
 * 作者：雨后☆星辰  在2018年-11月-07  完成，用于学习测试
 * 学习目标：
 * 学习內容：
 * 总结：
 * 知识点：
 */
public class BaseApplication extends Application {
    private static BaseApplication instance;
    public static synchronized BaseApplication getInstance() {
        return instance;
    }
    //字体图标
    private Typeface iconTypeFace;
    public Typeface getIconTypeFace() {
        return iconTypeFace;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        iconTypeFace = Typeface.createFromAsset(getAssets(),"fonts/iconfont.ttf");
    }
}

