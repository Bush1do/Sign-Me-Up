package io.github.bush1do.signmeup;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Charles on 10/25/2017.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
