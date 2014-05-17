package com.bignerdranch.android.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by habraham on 5/16/14.
 */
public class LastLocationLoader extends DataLoader<Location> {
    private long mRunId;

    public LastLocationLoader(Context context, long runId) {
        super(context);
        mRunId = runId;
    }

    /**
     */
    @Override
    public Location loadInBackground() {
        return RunManager.get(getContext()).getLastLocationForRun(mRunId);
    }
}
