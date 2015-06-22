package com.clouway.exceptions.practice;

/**
 * Created by clouway on 15-6-4.
 */

public class Exeption {

        public static void main(String args[]){
            try{
                int a[] = new int[2];
                System.out.println("Access element three :" + a[1]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown  :" + e);
            }
            System.out.println("Out of the block");
            try {
                String s="15434";
                for(int i=0;i<10;i++) {
                    char c = s.charAt(i);
                    System.out.println(c);
                }
            }catch (StringIndexOutOfBoundsException ex){
                System.out.println("ima po malko elementa ot 3 ");
            }
            int foo;
            String StringThatCouldBeANumberOrNot = "26263Hello";
            String StringThatCouldBeANumberOrNot2 = "26263";
            try {
                foo = Integer.parseInt(StringThatCouldBeANumberOrNot2);
                System.out.println("This true");
            } catch (NumberFormatException e) {
                System.out.println("This have to be only digit");
            }

            try {
                foo = Integer.parseInt(StringThatCouldBeANumberOrNot2);
            } catch (NumberFormatException e) {
            }

        }

}
