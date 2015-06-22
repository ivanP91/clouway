package com.clouway.objects.training;

/**
 * Created by clouway on 15-5-19.
 */
public class CarAggregation {
    private String make;
    private int year;
    private Engine engine;

    public CarAggregation(String make, int year, Engine engine) {
        this.make = make;
        this.year = year;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getEngineNumber() {

        return engine.getEngineSerialNumber();
    }
}
