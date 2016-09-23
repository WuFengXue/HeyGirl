package com.android.reverse.request;

import com.android.reverse.collecter.DexFileInfo;
import com.android.reverse.collecter.DexFileInfoCollecter;
import com.android.reverse.util.Logger;

import java.util.HashMap;
import java.util.Iterator;

public class DumpDexInfoCommandHandler implements CommandHandler {

    @Override
    public void doAction() {
        HashMap<String, DexFileInfo> dexfileInfo = DexFileInfoCollecter.getInstance().dumpDexFileInfo();
        Iterator<DexFileInfo> itor = dexfileInfo.values().iterator();
        DexFileInfo info = null;
        Logger.log("The DexFile Infomation ->");
        while (itor.hasNext()) {
            info = itor.next();
            Logger.log("filepath:" + info.getDexPath() + " mCookie:" + info.getmCookie());
        }
        Logger.log("End DexFile Infomation");
    }

}
