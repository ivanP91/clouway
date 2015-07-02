package com.clouway.inputOutput.task6;

import java.io.Serializable;

/**
 * Created by clouway on 15-6-19.
 */
public class Vehicle implements Serializable {
    public String model;
    public String color;
    public int volumeOfEngine;

    public Vehicle(String model, String color, int volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
        this.color = color;
        this.model = model;
    }
}
