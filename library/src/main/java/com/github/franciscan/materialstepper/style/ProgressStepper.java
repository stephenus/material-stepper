package com.github.franciscan.materialstepper.style;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.github.franciscan.materialstepper.R;

/**
 * Created by Francesco Cannizzaro on 24/12/2015.
 */
public class ProgressStepper extends BaseNavigation {

    // views
    protected ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        applyTheme();

        setContentView(R.layout.style_progress);

        init();

        mProgress = (ProgressBar) findViewById(R.id.stepProgress);
        mProgress.getProgressDrawable().setColorFilter(primaryColor, PorterDuff.Mode.SRC_ATOP);

        onUpdate();

    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        mProgress.setMax(mSteps.total());
        mProgress.setProgress(mSteps.current() + 1);
    }


    @Override
    public void onError() {
        super.onError();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mSwitch.setDisplayedChild(0);
            }
        }, 1500);
    }
}
