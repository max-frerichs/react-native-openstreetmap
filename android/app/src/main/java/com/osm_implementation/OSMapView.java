package com.osm_implementation;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.XYTileSource;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

import javax.annotation.Nullable;

public class OSMapView extends AppCompatActivity {
    MapView map = null;

    // Creates map instance from
    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the user agent with application ID.
        Configuration.getInstance().setUserAgentValue(BuildConfig.APPLICATION_ID);
        Context ctx = getApplicationContext();

        // Checks for required permissions
        if (ContextCompat.checkSelfPermission(ctx, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }

        if (ContextCompat.checkSelfPermission(ctx, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        }

        if (ContextCompat.checkSelfPermission(ctx, Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, 1);
        }

        if (ContextCompat.checkSelfPermission(ctx, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, 1);
        }

        setContentView(R.layout.map_view);
        map = (MapView) findViewById(R.id.map);
        IMapController mapController = map.getController();

        // TODO: Fix the user agent error by providing proper ID or changing the map tile provider
        final ITileSource tileSource = new XYTileSource( "HOT", 1, 20, 256, ".png",
                new String[] {
                        "https://maps.wikimedia.org"});
        map.setTileSource(tileSource);
        map.setMultiTouchControls(true);
        // sets zoom level and centers the map
        mapController.setZoom(1.5);
        GeoPoint startPoint = new GeoPoint(52.898697, 10.166548); // points to Faßberg, Germany. Greetings to RCAG (https://rc.ag)

        // centers the map on defined coordinates
        mapController.setCenter(startPoint);
    }

    public void onResume(){
        super.onResume();
        Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this));
        map.onResume();
    }

    public void onPause(){
        super.onPause();
        map.onPause();  
    }
}
