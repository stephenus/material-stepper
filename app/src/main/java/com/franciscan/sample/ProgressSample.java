package com.franciscan.sample;

import android.graphics.Color;
import android.os.Bundle;

import com.github.franciscan.materialstepper.AbstractStep;
import com.github.franciscan.materialstepper.style.ProgressStepper;

public class ProgressSample extends ProgressStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setColorPrimary(Color.parseColor("#009688"));
        setColorPrimaryDark(Color.parseColor("#00796b"));
        setErrorTimeout(1500);
        setTitle("Progress Stepper");

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
