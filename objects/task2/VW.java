package com.clouway.objects.task2;

/**
 * Created by clouway on 15-5-12.
 */
public class VW extends Car {
    public VW(int maxSpeed, String color, int buildDate) {
        super(maxSpeed, color, buildDate);
        System.out.println("VW  " + "Max speed: " + maxSpeed + "    Color: " + color + "    Date of build: " + buildDate);
    }
}
