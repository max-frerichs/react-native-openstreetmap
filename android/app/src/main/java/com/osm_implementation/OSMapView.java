package com.osm_implementation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.osmdroid.views.MapView;

import org.osmdroid.util.MapView

public class OSMapView extends MapView {
    private static final String TAG = MapView.class.getSimpleName();

    private static final String MAP_TYPE_NORMAL = "normal";
    private static final String MAP_TYPE_SATELLITE = "satellite";
    private Map map;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        map = new MapView(inflater.getContext(), 256, getContext());
        return map;
    }
    public OSMapView(Context context) {
        super(context);


    }
}
