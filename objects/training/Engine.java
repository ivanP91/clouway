package com.clouway.objects.training;

/**
 * Created by clouway on 15-5-19.
 */
public class Engine {
    private int engineCapacity;
    private int engineSerialNumber;

    public Engine(int engineCapacity, int engineSerialNumber) {
        this.engineCapacity = engineCapacity;
        this.engineSerialNumber = engineSerialNumber;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getEngineSerialNumber() {
        return engineSerialNumber;
    }
}
