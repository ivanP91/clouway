package com.clouway.exceptions.task2;

/**
 * Created by clouway on 15-6-4.
 */
public class ConsoleNumbers {

    public void consoleNumbers(int number){
        try {
            int inInt = number;
            if (inInt >= 0 && inInt <= 100){
                System.out.println("The number "+number+" is between 0 and 100");
            }
            else if (inInt < 0 || inInt > 100){
                throw new Exception(number+" is out of range.");
            }
        }
        catch (Exception e1) {
            System.out.println("The number "+number+" is not between 0 and 100.  Try again.");
            System.out.println();
        }
    }
}
