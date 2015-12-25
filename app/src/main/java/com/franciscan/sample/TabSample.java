package com.franciscan.sample;

import android.graphics.Color;
import android.os.Bundle;

import com.github.franciscan.materialstepper.AbstractStep;
import com.github.franciscan.materialstepper.style.TabStepper;

public class TabSample extends TabStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setColorPrimary(Color.parseColor("#795548"));
        setColorPrimaryDark(Color.parseColor("#5d4037"));

        boolean linear = getIntent().getBooleanExtra("linear", false);

        setErrorTimeout(1500);
        setLinear(linear);
        setTitle("Tab Stepper <small>(" + (linear ? "" : "Non ") + "Linear)</small>");

        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));
        addStep(createFragment(new StepSample()));

        super.onCreate(savedInstanceState);
    }

    private AbstractStep createFragment(AbstractStep fragment) {
        Bundle b = new Bundle();
        b.putInt("position", i++);
        fragment.setArguments(b);
        return fragment;
    }

}
