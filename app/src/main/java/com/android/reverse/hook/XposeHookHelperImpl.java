package com.android.reverse.hook;

import de.robv.android.xposed.XposedBridge;

import java.lang.reflect.Member;

public class XposeHookHelperImpl implements HookHelperInterface {

    @Override
    public void hookMethod(Member method, MethodHookCallBack callback) {
        // TODO Auto-generated method stub
        if (method != null)
            XposedBridge.hookMethod(method, callback);
    }

}
