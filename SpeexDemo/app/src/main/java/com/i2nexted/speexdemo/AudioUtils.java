package com.i2nexted.speexdemo;

import android.content.pm.LabeledIntent;

/**
 * Created by Administrator on 2017/11/30.
 * 对对应的pcm音频文件进行各种处理
 */

public class AudioUtils {
    private static final String LIB_NAME = "libspeex";
    public static int SAMPLE_RATE_16K = 16000;
    public static int SAMPLE_RATE_8K = 8000;
    public static int BITWIDTH_8BIT = 8;
    public static int BITWIDTH_16BIT = 16;
    public static int CHANNEL_MONO = 1;
    public static int CHANNEL_STEREO = 2;

    static {
        System.loadLibrary(LIB_NAME);
    }

    
}
