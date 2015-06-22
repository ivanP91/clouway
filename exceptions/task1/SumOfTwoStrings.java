package com.clouway.exceptions.task1;

/**
 * Created by clouway on 15-6-4.
 */
public class SumOfTwoStrings {
    public void sumOfStrings(String stringA, String stringB) {
        int intA;
        int intB;
        try {
            intA = Integer.parseInt(stringA);
            intB = Integer.parseInt(stringB);
            int c = intA + intB;
            System.out.println("These are results from two strings ----> " + c);
        } catch (NumberFormatException e) {
            System.out.println("Exception: The strings is not correct it must have only digits! ");
        }
    }
}
