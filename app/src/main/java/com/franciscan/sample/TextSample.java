package com.franciscan.sample;

import android.os.Bundle;

import com.github.franciscan.materialstepper.AbstractStep;
import com.github.franciscan.materialstepper.style.TextStepper;

public class TextSample extends TextStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // setColorPrimary(Color.parseColor("#f44336"));
        // setColorPrimaryDark(Color.parseColor("#d32f2f"));
        setErrorTimeout(1000);
        setTitle("Text Stepper");

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
