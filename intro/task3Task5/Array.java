package com.clouway.intro.task3Task5;

import java.util.Arrays;

/**
 * Created by clouway on 15-5-4.
 */
public class Array {

    /**
     * Return minimal element of array
     * @param array
     * @return
     */
    public  int getMinElement(int[] array){
      int minElement=array[0];
      for(int i=1; i<array.length; i++){
          if(minElement>array[i]){
              minElement=array[i];
          }
      }
      return minElement;
  }
    /**
     * Return sum of elements of array
     * @param Array
     * @return
     */
    public int getSum(int Array[]) {

        int sum=0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return sum;
    }

    /**
     * Printing array
     * @param array
     */
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tempVar = array[i];
            int a = i + 1;
            System.out.println(a + " element is " + tempVar + " ");
        }
    }


    /**
     * Reverse array
     * @param array
     */
    public void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int tempVar = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempVar;
        }
        System.out.println("Revers Array" + Arrays.toString(array));

    }

}
