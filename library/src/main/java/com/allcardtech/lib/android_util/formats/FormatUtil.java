package com.allcardtech.lib.android_util.formats;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatUtil {

    public static String getLocalPrice(double amount) {
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("FIL", "PH"));
        numberFormat.setMaximumFractionDigits(2);

        return numberFormat.format(amount);
    }

    public static String getForeignPrice(double amount, String type) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("en", type));
        numberFormat.setMaximumFractionDigits(2);

        return numberFormat.format(amount);
    }

    public static String getPriceFormat(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(amount);
    }

    public static String getPriceWithoutDecimalFormat(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        return decimalFormat.format(amount);
    }
}
