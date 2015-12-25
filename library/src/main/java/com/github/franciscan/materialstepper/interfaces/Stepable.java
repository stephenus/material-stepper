package com.github.franciscan.materialstepper.interfaces;

/**
 * Created by Francesco Cannizzaro on 24/12/2015.
 */
public interface Stepable {
    void onPrevious();

    void onNext();

    void onError();

    void onUpdate();

}
