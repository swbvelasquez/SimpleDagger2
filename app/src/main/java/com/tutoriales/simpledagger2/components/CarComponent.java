package com.tutoriales.simpledagger2.components;

import com.tutoriales.simpledagger2.MainActivity;
import com.tutoriales.simpledagger2.entities.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity activity); //se necesita declarar especificamente la activity para la forma 2
}
