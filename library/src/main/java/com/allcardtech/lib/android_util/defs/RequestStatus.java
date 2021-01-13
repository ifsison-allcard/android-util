package com.allcardtech.lib.android_util.defs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

@IntDef({RequestStatus.SUCCESS, RequestStatus.FAILED})
@Retention(RetentionPolicy.SOURCE)
public @interface RequestStatus {
    int SUCCESS = 0;
    int FAILED = 1;
}
