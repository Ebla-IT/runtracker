package com.eblait.android.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by habraham on 5/10/14.
 */
public class TrackingLocationReceiver extends LocationReceiver{
    @Override
    protected void onLocationReceived(Context c, Location loc) {
        RunManager.get(c).insertLocation(loc);
    }
}
