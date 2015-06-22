package com.clouway.objects.training;

/**
 * Created by clouway on 15-5-19.
 */
public class Driver {
    String name;
    public Driver(String name){
        this.name=name;
    }

    public void drive(Car car) {
        System.out.println(name +" kara "+car.model+" s "+car.speed+" km/h");
    }
}
