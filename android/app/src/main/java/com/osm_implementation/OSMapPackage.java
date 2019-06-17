package com.osm_implementation;


import android.app.Activity;

import com.facebook.react.ReactNativeHost;
import com.facebook.react.uimanager.ViewManager;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OSMapPackage implements ReactPackage {
    public OSMapPackage(ReactNativeHost reactNativeHost) {

    }
    private Activity mActivity = null;

    public OSMapPackage(Activity activity) {
        mActivity = activity;
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(new OSMapModule(reactContext));
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        OSMapViewManager mapManager = new OSMapViewManager(mActivity);
        return Arrays.<ViewManager>asList(mapManager);
    }
}

