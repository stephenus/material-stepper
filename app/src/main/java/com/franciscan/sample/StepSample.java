package com.franciscan.sample;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.github.franciscan.materialstepper.AbstractStep;

/**
 * Created by Francesco Cannizzaro on 23/12/2015.
 */
public class StepSample extends AbstractStep {

    private int i = 1;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.step, container, false);
        ((TextView) v.findViewById(R.id.title)).setText("Step " + getArguments().getInt("position", 0));
        button = (Button) v.findViewById(R.id.button);
        button.setText(Html.fromHtml("Count Click <b>0</b>"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setText(Html.fromHtml("Click <b>" + (++i) + "</b>"));
                mStepper.getExtras().putInt("Click", i);
            }
        });

        return v;
    }

    @Override
    public String name() {
        return "Tab " + getArguments().getInt("position", 0);
    }

    @Override
    public boolean nextIf() {
        return i > 1;
    }

    @Override
    public String error() {
        return "<b>you must click 2 times or more!</b> <small>condition!</small>";
    }
}
