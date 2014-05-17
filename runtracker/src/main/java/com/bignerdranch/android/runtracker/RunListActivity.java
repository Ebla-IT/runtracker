package com.bignerdranch.android.runtracker;
import android.support.v4.app.Fragment;
/**
 * Created by habraham on 5/10/14.
 */
public class RunListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
