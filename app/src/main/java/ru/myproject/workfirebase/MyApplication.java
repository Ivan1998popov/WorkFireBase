package ru.myproject.workfirebase;


import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;


/**
 * Created by ashish123 on 22/8/15.
 */
public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        try {
            FirebaseApp.initializeApp(this);
        }
        catch (Exception e) {
        }
    }

    public static Context getInstance() {
        return mInstance;
    }
}
