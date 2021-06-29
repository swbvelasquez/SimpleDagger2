package com.tutoriales.simpledagger2.components;

import com.tutoriales.simpledagger2.MainActivity;
import com.tutoriales.simpledagger2.entities.Car;
import com.tutoriales.simpledagger2.modules.WheelsModule;

import dagger.Component;

//Se encarga del grapp o grafo de creacion de dependencias
//Utiliza modulos para ayudarse en la creacion
@Component(modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    void inject(MainActivity activity); //se necesita declarar especificamente la activity para la forma 2
}
