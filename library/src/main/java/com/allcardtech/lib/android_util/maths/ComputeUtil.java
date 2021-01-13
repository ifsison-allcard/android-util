package com.allcardtech.lib.android_util.maths;

public class ComputeUtil {

    public static Double getChange(double total, double cash) {
        double change = cash - total;
        if (change > 0) return change;
        else return 0.00;
    }

    public static double getTotal(double amount, double convenienceFee) {
        return amount + convenienceFee;
    }

    public static boolean isCashEnough(double totalAmt, double cashAmt) {
        return cashAmt >= totalAmt;
    }
}
