package com.allcardtech.lib.android_util.objects;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;

public class TextUtil {

    public static SpannableStringBuilder getCustomText(String textToCustom, String delimiter, float sizeIncrease) {
        RelativeSizeSpan largeSizeText = new RelativeSizeSpan(sizeIncrease);

        SpannableStringBuilder builder = new SpannableStringBuilder(textToCustom);
        builder.setSpan(largeSizeText, textToCustom.indexOf(delimiter) + 1, textToCustom.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return builder;
    }
}
