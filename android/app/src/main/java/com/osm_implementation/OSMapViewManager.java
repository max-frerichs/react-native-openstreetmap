package com.osm_implementation;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class OSMapViewManager extends ViewGroupManager<OSMapView> {
    public static final String REACT_CLASS = "OSMapView";

    private static final String TAG = OSMapViewManager.class.getSimpleName();

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected OSMapView createViewInstance(ThemedReactContext reactContext) {
        return new OSMapView (reactContext);
    }


}
