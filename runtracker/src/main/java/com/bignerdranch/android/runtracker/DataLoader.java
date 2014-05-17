package com.bignerdranch.android.runtracker;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by habraham on 5/16/14.
 */
public abstract class DataLoader<D> extends AsyncTaskLoader<D> {

    private D mData;

    public DataLoader(Context context) {
        super(context);
    }

    /**
     * Sends the result of the load to the registered listener. Should only be called by subclasses.
     * <p/>
     * Must be called from the process's main thread.
     *
     * @param data the result of the load
     */
    @Override
    public void deliverResult(D data) {
        mData = data;
        if (isStarted())
            super.deliverResult(data);
    }


    /**
     * Subclasses must implement this to take care of loading their data,
     * as per {@link #startLoading()}.  This is not called by clients directly,
     * but as a result of a call to {@link #startLoading()}.
     */
    @Override
    protected void onStartLoading() {
        if (mData != null) {
            deliverResult(mData);
        }
        else {
            forceLoad();
        }
    }
}
