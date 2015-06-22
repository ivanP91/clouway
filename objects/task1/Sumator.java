package com.clouway.objects.task1;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 15-5-5.
 */
public class Sumator {

    public int sum(int a, int b){

        return  (a+b);
    }

    public double sum(double a, double b ){

        return  (a+b);
    }

    public void sum(String a, String b){
        System.out.println(a+b);
    }

     public void sum(BigInteger a, BigInteger b){
        BigInteger result = a.add(b);
        System.out.println(result);
    }

     public void sum(BigDecimal a, BigDecimal b){

         BigDecimal result = a.add(b);
         System.out.println(result);
     }


}
