package com.allcardtech.lib.android_util.alarms;

import android.os.Handler;
import android.os.Looper;

public class TimerUtil {

    private static TimerUtil mInstance;
    private static TimerUtilInterface mInterface;

    private long duration;

    public interface TimerUtilInterface {
        void onTimerStopped();
    }

    // Create an instance of the class once.
    public static TimerUtil getInstance(TimerUtilInterface delegate) {
        if (mInstance == null) {
            mInstance = new TimerUtil();
        }

        mInterface = delegate;

        return mInstance;
    }

    // Used by activities to start the timer.
    public void startTimer(long duration) {
        this.duration = duration;

        mInstance.startTimer();
    }

    // Access within class only to start the timer by the instance.
    private void startTimer() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                mInterface.onTimerStopped();
            }
        }, duration);
    }
}
