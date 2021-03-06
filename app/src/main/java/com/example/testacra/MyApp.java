package com.example.testacra;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import org.acra.ACRA;
import org.acra.BuildConfig;
import org.acra.annotation.AcraCore;
import org.acra.annotation.AcraToast;

@SuppressWarnings("WeakerAccess")
@AcraCore(buildConfigClass = BuildConfig.class, stopServicesOnCrash = true)
@AcraToast(resText = R.string.acra_toast_text)
public class MyApp extends Application {
    public static final String TAG = "X.testacra";

    @Override protected void attachBaseContext(Context base) {
        Log.i(MyApp.TAG, "MyApp.attachBaseContext()");
        super.attachBaseContext(base);
        ACRA.init(this);
    }
}
