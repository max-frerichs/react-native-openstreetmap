package com.osm_implementation;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.io.Closeable;
import java.io.IOException;

public class OSMapModule extends ReactContextBaseJavaModule {
    private static final String TAG = OSMapModule.class.getSimpleName();
    public static final String REACT_CLASS = "OSMapView";
    OSMapModule (ReactApplicationContext reactContext) {
            super(reactContext);
        }

        @Override
        public String getName() {
            return REACT_CLASS;
        }

        // To expose a method to JavaScript a Java method must be annotated using @ReactMethod.
        // The return type of bridge methods is always void.
        // React Native bridge is asynchronous, so the only way to pass a result to JavaScript
        // is by using callbacks or emitting events (see below).

        public Activity getActivity() {
            return getCurrentActivity();
        }

        public static void closeQuietly(Closeable closeable) {
            if (closeable == null) return;
            try {
                closeable.close();
            } catch (IOException ignored) {
            }
        }
}
