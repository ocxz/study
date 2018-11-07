package com.study.cxz.mystu_11_7.myviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.study.cxz.mystu_11_7.Application.BaseApplication;

public class IconView extends  android.support.v7.widget.AppCompatTextView {
    public IconView(Context context) {
        super(context);
        init();
    }
    public IconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public IconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
//        设置字体图标
        this.setTypeface(BaseApplication.getInstance().getIconTypeFace());
    }
}