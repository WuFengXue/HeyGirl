package com.android.reverse.collecter;

import android.os.Debug;

import java.io.IOException;

public class HeapDump {

    public static void dumpHeap(String filename) {
        try {
            Debug.dumpHprofData(filename);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
