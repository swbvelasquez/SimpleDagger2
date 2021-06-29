package com.tutoriales.simpledagger2.entities;

import javax.inject.Inject;

public class Wheels {
    private Rims rims;
    private Tires tires;

    @Inject
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
