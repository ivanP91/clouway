package com.clouway.objects.training;

/**
 * Created by clouway on 15-5-19.
 */
public class CarComposition {
    private String make;
    private int year;
    private Engine engine;

    public CarComposition(String make, int year, int engineCapacity, int engineSerialNumber) {
        this.make=make;
        this.year=year;
        engine = new Engine(engineCapacity, engineSerialNumber);
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getEngineSerialNumber() {

        return engine.getEngineSerialNumber();
    }

    public int getEngineCapacity()
    {
        return engine.getEngineCapacity();
    }
}
