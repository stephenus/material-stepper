package com.github.franciscan.materialstepper.interfaces;

/**
 * Created by Francesco Cannizzaro on 23/12/2015.
 */
public interface Nextable {

    boolean nextIf();

    boolean isOptional();

    String error();

}
