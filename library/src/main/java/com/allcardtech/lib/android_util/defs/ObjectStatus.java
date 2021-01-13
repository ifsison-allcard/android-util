package com.allcardtech.lib.android_util.defs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

@IntDef({ObjectStatus.ACTIVE, ObjectStatus.INACTIVE})
@Retention(RetentionPolicy.SOURCE)
public @interface ObjectStatus {
    int ACTIVE = 0;
    int INACTIVE = 1;
}