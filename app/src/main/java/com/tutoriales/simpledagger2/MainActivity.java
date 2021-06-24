package com.tutoriales.simpledagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutoriales.simpledagger2.components.CarComponent;
import com.tutoriales.simpledagger2.components.DaggerCarComponent;
import com.tutoriales.simpledagger2.entities.Car;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Detras estan las clases injectadas y el componente que se auto construye con la clase component en la interfaz declarada
        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();
    }
}