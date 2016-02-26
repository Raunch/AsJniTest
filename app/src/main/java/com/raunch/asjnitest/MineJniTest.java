package com.raunch.asjnitest;

/**
 * Created by songshunzhang on 16-2-26.
 */
public class MineJniTest {
    static {
        System.loadLibrary("");
    }
    public native String getCLanguageString();

}
