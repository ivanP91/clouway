package com.clouway.objects;

import com.clouway.objects.task2.Opel;
import com.clouway.objects.task1.Sumator;
import com.clouway.objects.task2.VW;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 15-5-7.
 */

public class Results {
    public static void main(String[] args) {
        Sumator suma=new Sumator();
        String as="25";
        String bs="25";
        suma.sum(as, bs);
        BigInteger ab= new BigInteger("777777777777777");
        BigInteger bb= new BigInteger("111111111111111");
        suma.sum(ab, bb);
        BigDecimal ad= new BigDecimal("777777777777777");
        BigDecimal bd= new BigDecimal("111111111111111");
        suma.sum(ad, bd);

        VW vw=new VW(2,"red",4);
        Opel opel=new Opel(4,"blue",4,5,6);

    }
}
