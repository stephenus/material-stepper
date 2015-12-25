package com.franciscan.sample;

import android.graphics.Color;
import android.os.Bundle;

import com.github.franciscan.materialstepper.AbstractStep;
import com.github.franciscan.materialstepper.style.DotStepper;

public class DotsSample extends DotStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setColorPrimary(Color.parseColor("#ff5722"));
        setColorPrimaryDark(Color.parseColor("#e64a19"));
        setErrorTimeout(1500);
        setTitle("Dots Stepper");

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
