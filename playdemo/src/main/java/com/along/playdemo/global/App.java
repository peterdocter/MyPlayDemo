package com.along.playdemo.global;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by and2long on 16-7-31.
 */
public class App extends Application {
    private static Context context;
    private static Handler mHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        mHandler = new Handler();
    }

    public static Context getContext() {
        return context;
    }

    public static Handler getMainHandler() {
        return mHandler;
    }

}
