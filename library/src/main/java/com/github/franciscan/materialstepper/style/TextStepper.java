package com.github.franciscan.materialstepper.style;

import android.os.Bundle;
import android.widget.TextView;

import com.github.franciscan.materialstepper.R;

/**
 * Created by Francesco Cannizzaro on 24/12/2015.
 */
public class TextStepper extends BaseNavigation {

    // views
    protected TextView mCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        applyTheme();

        if (getSupportActionBar() != null)
            getSupportActionBar().setElevation(0);

        setContentView(R.layout.style_text);
        init();

        mSwitch.setInAnimation(TextStepper.this, R.anim.in_from_top);
        mSwitch.setOutAnimation(TextStepper.this, R.anim.out_to_top);
        mCounter = (TextView) findViewById(R.id.stepCounter);

        onUpdate();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        mCounter.setText(String.format("Step %d of %d", mSteps.current() + 1, mSteps.total()));
    }

}
