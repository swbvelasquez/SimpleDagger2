package com.tutoriales.simpledagger2.modules;

import com.tutoriales.simpledagger2.entities.Rims;
import com.tutoriales.simpledagger2.entities.Tires;
import com.tutoriales.simpledagger2.entities.Wheels;

import dagger.Module;
import dagger.Provides;

//Cuando se trabaja con librerias de terceros que no se pueden modificar, se debe utilizar modulos para el apoyo en la creacion de dependencias
@Module
public class WheelsModule {

    //Si no se puede utilizar la anotación inject
    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    //Si se requiere configuración especifica
    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate(); //configuración
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
