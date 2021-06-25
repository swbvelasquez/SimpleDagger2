package com.tutoriales.simpledagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutoriales.simpledagger2.components.CarComponent;
import com.tutoriales.simpledagger2.components.DaggerCarComponent;
import com.tutoriales.simpledagger2.entities.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        injectionForm2();
    }

    private void injectionForm1(){
        //injeccion 1 a 1
        Car car;
        CarComponent carComponent = DaggerCarComponent.create();  //Detras estan las clases injectadas y el componente que se auto construye con la clase component en la interfaz declarada
        car = carComponent.getCar();
        car.drive();
    }

    private void injectionForm2(){
        //injeccion por parametro, solo para activitys o fragments
        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car2.drive();
    }
}