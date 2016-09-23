package com.android.reverse.apimonitor;

import com.android.reverse.hook.HookParam;
import com.android.reverse.util.Logger;
import com.android.reverse.util.RefInvoke;

import java.lang.reflect.Method;

public class AudioRecordHook extends ApiMonitorHook {

    @Override
    public void startHook() {
        // TODO Auto-generated method stub
        Method startRecordingMethod = RefInvoke.findMethodExact(
                "android.media.AudioRecord", ClassLoader.getSystemClassLoader(),
                "startRecording");
        hookhelper.hookMethod(startRecordingMethod, new AbstractBahaviorHookCallBack() {

            @Override
            public void descParam(HookParam param) {
                // TODO Auto-generated method stub
                Logger.log_behavior("Audio Recording ->");
            }
        });

    }

}
