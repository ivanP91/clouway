package com.clouway.objects.training;

/**
 * Created by clouway on 15-5-18.
 */
public class DemoTest {
    public static void main(String[] args) {
        CompareStrings proba=new CompareStrings();
        proba.compare();

        CarComposition comp=new CarComposition("Opel",1994,2000,256657);
        System.out.println(comp.getEngineSerialNumber());


        Engine engine=new Engine(1800, 53424525);
        CarAggregation aggr=new CarAggregation("opel", 1998, engine);
        System.out.println(aggr.getEngineNumber());

        Car car=new Car(20, "opel");
        Driver driver=new Driver("ivan");
        driver.drive(car);

        Odd oddSum=new Odd();
        System.out.println(oddSum.sumOdd());
        System.out.println(oddSum.sumOddWhile());
    }
}
