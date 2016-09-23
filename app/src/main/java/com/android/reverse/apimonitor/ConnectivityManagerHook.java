package com.android.reverse.apimonitor;

import com.android.reverse.hook.HookParam;
import com.android.reverse.util.Logger;
import com.android.reverse.util.RefInvoke;

import java.lang.reflect.Method;

public class ConnectivityManagerHook extends ApiMonitorHook {

    @Override
    public void startHook() {

        Method setMobileDataEnabledmethod = RefInvoke.findMethodExact(
                "android.net.ConnectivityManager", ClassLoader.getSystemClassLoader(),
                "setMobileDataEnabled", boolean.class);
        hookhelper.hookMethod(setMobileDataEnabledmethod, new AbstractBahaviorHookCallBack() {

            @Override
            public void descParam(HookParam param) {
                boolean status = (Boolean) param.args[0];
                Logger.log("Set MobileDataEnabled = " + status);
            }
        });

    }

}
