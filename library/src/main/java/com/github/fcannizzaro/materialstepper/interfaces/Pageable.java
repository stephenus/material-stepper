package com.github.fcannizzaro.materialstepper.interfaces;

import com.github.fcannizzaro.materialstepper.AbstractStep;

import java.util.List;

/**
 * Created by Francesco Cannizzaro on 08/05/2016.
 */
public interface Pageable {

    public void add(AbstractStep fragment);

    public void set(List<AbstractStep> fragments);

}
