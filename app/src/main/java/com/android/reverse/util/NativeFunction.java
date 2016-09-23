package com.android.reverse.util;

import com.android.reverse.collecter.ModuleContext;
import com.android.reverse.smali.DexFileHeadersPointer;

import org.jf.dexlib2.dexbacked.MemoryDexFileItemPointer;
import org.jf.dexlib2.dexbacked.MemoryReader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;


public class NativeFunction implements MemoryReader {

    private final static String DVMNATIVE_LIB = "/data/data/com.android.reverse/lib/libdvmnative.so";

    static {
        System.load(DVMNATIVE_LIB);
    }

    public static native ByteBuffer dumpDexFileByClass(Class classInDex, int version);

    public static native ByteBuffer dumpDexFileByCookie(long cookie, int version);

    public static native ByteBuffer dumpMemory(int start, int length);

    private static native DexFileHeadersPointer getHeaderItemPtr(long cookie, int version);

    public static native String getInlineOperation();

    public static native HashMap getSyslinkSnapshot();

    public static MemoryDexFileItemPointer queryDexFileItemPointer(long cookie) {
        int version = ModuleContext.getInstance().getApiLevel();
        DexFileHeadersPointer iteminfo = getHeaderItemPtr(cookie, version);
        MemoryDexFileItemPointer pointer = new MemoryDexFileItemPointer();
        pointer.setBaseAddr(iteminfo.getBaseAddr());
        pointer.setpClassDefs(iteminfo.getpClassDefs());
        pointer.setpFieldIds(iteminfo.getpFieldIds());
        pointer.setpMethodIds(iteminfo.getpMethodIds());
        pointer.setpProtoIds(iteminfo.getpProtoIds());
        pointer.setpStringIds(iteminfo.getpStringIds());
        pointer.setpTypeIds(iteminfo.getpTypeIds());
        pointer.setClassCount(iteminfo.getClassCount());
        return pointer;

    }

    public byte[] readBytes(int arg0, int arg1) {
        // TODO Auto-generated method stub
        ByteBuffer data = dumpMemory(arg0, arg1);
        data.order(ByteOrder.LITTLE_ENDIAN);
        byte[] buffer = new byte[data.capacity()];
        data.get(buffer, 0, data.capacity());
        return buffer;
    }

}
