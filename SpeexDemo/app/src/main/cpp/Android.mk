LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := libspeex
LOCAL_CFLAGS = -DFIXED_POINT -DUSE_KISS_FFT -DEXPORT="" -UHAVE_CONFIG_H


LOCAL_SRC_FILES := testresample.c
LOCAL_C_INCLUDES := speex_resampler.h speexdsp_config_types.h speexdsp_types.h

include $(BUILD_SHARED_LIBRARY)