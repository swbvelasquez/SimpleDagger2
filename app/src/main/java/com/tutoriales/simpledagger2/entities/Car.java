package com.tutoriales.simpledagger2.entities;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG="Car";
    private Engine engine;
    private Wheels wheels;

    //Existen 3 formas de injectar, la primera por constructor, la segunda por campo y la tercera por metodo, y se ejecutan en el orden antes mencionado
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    //Este metodo se ejecuta luego de que se ha creado el constructor
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }
}
