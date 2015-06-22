package com.clouway.intro;

import com.clouway.intro.task1Task2.Math1;
import com.clouway.intro.task3Task5.Array;
import com.clouway.intro.task6.StringGenerator;

import java.lang.*;

/**
 * Created by clouway on 15-5-4.
 */
public class Demo {
    public static void main(String[] args) {
        Math1 gcd = new Math1();
        System.out.println(gcd.gcd(54, 60));

        Math1 lcm = new Math1();
        System.out.println(lcm.lcm(54, 60));

        int[] arrayTest = {6, 2, 8, 4, 5, 3, -4};
        Array array1 = new Array();
        System.out.println("Minimal Element");
        System.out.println(array1.getMinElement(arrayTest));

        System.out.println("Sum of elements of array ");
        System.out.println(array1.getSum(arrayTest));

        System.out.println("Printing Array");
        array1.print(arrayTest);

        array1.reverse(arrayTest);
        System.out.print("My Shuffle String is:  ");
        StringGenerator randomString = new StringGenerator();
        randomString.shuffleString(19, 'a', 'z');
    }

}
