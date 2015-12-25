package com.github.franciscan.materialstepper.style;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;

import com.github.franciscan.materialstepper.AbstractStep;
import com.github.franciscan.materialstepper.R;
import com.github.franciscan.materialstepper.adapter.PageAdapter;

import java.util.List;

/**
 * Created by Francesco Cannizzaro on 24/12/2015.
 */
public class BasePager extends BaseStyle {

    // view
    protected ViewPager mPager;

    // adapters
    protected PageAdapter mPagerAdapter;

    protected void init() {
        mPager = (ViewPager) findViewById(R.id.stepPager);
        mPager.setAdapter(mPagerAdapter);
        mPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    private void initAdapter() {
        if (mPagerAdapter == null)
            mPagerAdapter = new PageAdapter(getSupportFragmentManager());
    }

    @Override
    public void addStep(AbstractStep step) {
        super.addStep(step);
        initAdapter();
        mPagerAdapter.add(step);
    }

    @Override
    public void addSteps(List<AbstractStep> steps) {
        super.addSteps(steps);
        initAdapter();
        mPagerAdapter.set(mSteps.getSteps());
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        mPager.setCurrentItem(mSteps.current());
    }

}
