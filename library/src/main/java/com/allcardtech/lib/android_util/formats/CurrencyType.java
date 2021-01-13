package com.allcardtech.lib.android_util.formats;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;
import androidx.annotation.StringDef;

@StringDef({CurrencyType.US_DOLLAR, CurrencyType.KOR_WON, CurrencyType.NOKOR_WON, CurrencyType.SOKOR_WON, CurrencyType.CN_YUAN})
@Retention(RetentionPolicy.SOURCE)
public @interface CurrencyType {
    String US_DOLLAR = "US";
    String KOR_WON = "ko";
    String NOKOR_WON = "ko_KP";
    String SOKOR_WON = "ko_KR";
    String CN_YUAN = "CN";
}
