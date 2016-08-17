package com.along.playdemo.util;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.along.playdemo.global.App;

public class CommonUtils {

    /***
     * 移除掉当前的子视图
     */
    public static void removeSelfFromParent(View child) {
        //判断当前的子视图是否是空值
        if (child != null) {
            //得到子视图的父亲
            ViewParent parent = child.getParent();
            //判断当前的父视图,是否是ViewGroup的类型
            if (parent != null && parent instanceof ViewGroup) {
                //移除当前的子视图
                ViewGroup viewGroup = (ViewGroup) parent;
                //移除掉当前的子视图
                viewGroup.removeView(child);
            }
        }
    }

    public static void runOnUIThread(Runnable runnable) {
        App.getMainHandler().post(runnable);
    }

    public static float getDimens(int resId) {
        return App.getContext().getResources()
                .getDimension(resId);
    }

    public static String getString(int resId) {
        return App.getContext().getResources()
                .getString(resId);
    }

    public static String[] getStringArray(int resId) {
        return App.getContext().getResources()
                .getStringArray(resId);
    }
}
