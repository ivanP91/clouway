package com.clouway.exceptions.task4;

import com.clouway.exceptions.task1.SumOfTwoStrings;
import com.clouway.exceptions.task2.ConsoleNumbers;

import java.util.Scanner;

/**
 * Created by clouway on 15-6-4.
 */
public class Demo {
    public static void main(String[] args) {

        SumOfTwoStrings sum = new SumOfTwoStrings();
        SumOfTwoStrings sum1 = new SumOfTwoStrings();
        sum.sumOfStrings("12345", "4553");
        System.out.println();
        sum1.sumOfStrings("322424", "3213c31");
        System.out.println();
        ConsoleNumbers number=new ConsoleNumbers();
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        number.consoleNumbers(a);
        System.out.println();
        ListOfElements list = new ListOfElements();
        System.out.println("Remove from empty list");
        list.remove();
        System.out.println();
        list.add(sum);
        list.add(sum1);
        list.add(sum);
        list.add(sum);
        list.add(sum);
        System.out.println();
        System.out.println("Printing list");
        list.printAllElements();
        System.out.println();
        list.remove();
        System.out.println("Printing list after remove last ");
        list.printAllElements();
    }
}
