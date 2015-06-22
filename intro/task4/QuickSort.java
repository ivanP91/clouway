package com.clouway.intro.task4;

/**
 * Created by clouway on 15-5-13.
 */
public class QuickSort {

    /**
     * @param inputArray
     */
    public void quickSort(int[] inputArray) {
        int length = inputArray.length;
        quickSort(inputArray, 0, length - 1);
    }

    /**
     * @param array
     * @param low
     * @param high
     */
    private void quickSort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[low + (high - low) / 2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapNumbers(array, i, j);
                i++;
                j--;
            }
        }
        if (low < j){
            quickSort(array, low, j);
        }
        if (i < high){
            quickSort(array, i, high);
        }
    }

    /**
     * @param array
     * @param i
     * @param j
     */
    private void swapNumbers(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
