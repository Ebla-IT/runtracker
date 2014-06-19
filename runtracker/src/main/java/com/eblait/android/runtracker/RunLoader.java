package com.eblait.android.runtracker;

import android.content.Context;

/**
 * Created by habraham on 5/16/14.
 */
public class RunLoader extends DataLoader<Run> {
    private long mRunId;

    public RunLoader(Context context, long runId) {
        super(context);
        mRunId = runId;
    }

    /**
     */
    @Override
    public Run loadInBackground() {
        return RunManager.get(getContext()).getRun(mRunId);
    }
}
