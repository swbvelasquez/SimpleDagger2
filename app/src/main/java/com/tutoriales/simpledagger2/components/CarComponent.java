package com.tutoriales.simpledagger2.components;

import com.tutoriales.simpledagger2.entities.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
}
