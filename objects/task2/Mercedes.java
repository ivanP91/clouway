package com.clouway.objects.task2;

/**
 * Created by clouway on 15-5-12.
 */
public class Mercedes extends Car {
    public Mercedes(int maxSpeed, String color, int buildDate) {
        super(maxSpeed, color, buildDate);
        System.out.println("Mercedes  " + "Max speed: " + maxSpeed + "    Color: " + color + "    Date of build: " + buildDate);
    }
}
