package com.clouway.objects.task2;

/**
 * Created by clouway on 15-5-12.
 */
public class Opel extends Car {
    private int weight;
    private int numberOfPassengers;

    public Opel(int maxSpeed, String color, int buildDate, int weight, int numberOfPassengers) {
        super(maxSpeed, color, buildDate);
        this.weight = weight;
        this.numberOfPassengers = numberOfPassengers;
        System.out.println("Opel  " + "Max speed: " + maxSpeed + "    Color: " + color + "    Date of build: " + buildDate + "    Weight: " + weight + "    Number of passengers: " + numberOfPassengers);
    }
}
