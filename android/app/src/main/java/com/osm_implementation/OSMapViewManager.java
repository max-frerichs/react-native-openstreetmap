package com.osm_implementation;

import android.app.Activity;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

public class OSMapViewManager extends ViewGroupManager<MapView> {
    public ThemedReactContext mContext = null;
    public Activity mActivity;
    public static MapController mapController = null;
    // Defines the
    public static final String REACT_CLASS = "MapView";
    private static final String TAG = OSMapViewManager.class.getSimpleName();

    @Override
    public String getName() {
        return REACT_CLASS;
    }
    public OSMapViewManager(Activity activity) {
        mActivity = activity;
    }
    @Override
    protected MapView createViewInstance(ThemedReactContext reactContext) {
        return new MapView (reactContext);
    }

    /*
        TODO: Add more properties in further development
        TODO: Create some spicy tests
    */


    @ReactProp(name = "zoomLevel")
    public static void setZoom(MapView view, double zoomLevel) {
        view.setMaxZoomLevel(zoomLevel);
    }
}
