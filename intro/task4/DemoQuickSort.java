package com.clouway.intro.task4;


/**
 * Created by clouway on 15-5-13.
 */
public class DemoQuickSort {
    public static void main(String[] args) {
        int[] input={ 6, 3, 8, 2, 3, 5, 7, 8, 9, 1};
        QuickSort newSort = new QuickSort();
        newSort.quickSort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
