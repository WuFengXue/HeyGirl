package org.jf.dexlib2.dexbacked;

public class MemoryDexFileItemPointer {

    private int baseAddr;
    private int pStringIds;
    private int pTypeIds;
    private int pFieldIds;
    private int pMethodIds;
    private int pProtoIds;
    private int pClassDefs;
    private int classCount;


    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public int getBaseAddr() {
        return baseAddr;
    }

    public void setBaseAddr(int baseAddr) {
        this.baseAddr = baseAddr;
    }

    public int getpStringIds() {
        return pStringIds;
    }

    public void setpStringIds(int pStringIds) {
        this.pStringIds = pStringIds;
    }

    public int getpTypeIds() {
        return pTypeIds;
    }

    public void setpTypeIds(int pTypeIds) {
        this.pTypeIds = pTypeIds;
    }

    public int getpFieldIds() {
        return pFieldIds;
    }

    public void setpFieldIds(int pFieldIds) {
        this.pFieldIds = pFieldIds;
    }

    public int getpMethodIds() {
        return pMethodIds;
    }

    public void setpMethodIds(int pMethodIds) {
        this.pMethodIds = pMethodIds;
    }

    public int getpProtoIds() {
        return pProtoIds;
    }

    public void setpProtoIds(int pProtoIds) {
        this.pProtoIds = pProtoIds;
    }

    public int getpClassDefs() {
        return pClassDefs;
    }

    public void setpClassDefs(int pClassDefs) {
        this.pClassDefs = pClassDefs;
    }

    public String toString() {
        return "baseAddr:" + baseAddr + ";pStringIds:" + pStringIds + ";pTypeIds:" + pTypeIds + ";pFieldIds:" + pFieldIds + ";pMethodIds:" + pMethodIds + ";pProtoIds:" + pProtoIds + ";pClassDefs:" + pClassDefs;
    }

}
