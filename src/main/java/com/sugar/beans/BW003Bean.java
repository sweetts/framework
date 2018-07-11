package com.sugar.beans;

/**
 * Created by TangSu on 2017/5/23.
 */
public class BW003Bean {
    private String BWID001;
    private String BWNR001;

    public String getBWID001() {
        return BWID001;
    }

    public void setBWID001(String BWID001) {
        this.BWID001 = BWID001;
    }

    public String getBWNR001() {
        return BWNR001;
    }

    public void setBWNR001(String BWNR001) {
        this.BWNR001 = BWNR001;
    }

    @Override
    public String toString(){
        return "BWID001: "+BWID001+"   ,   BWNR001： "+BWNR001;
    }
}
