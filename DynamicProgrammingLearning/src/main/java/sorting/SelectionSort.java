package main.java.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array){

        for(int i = 0; i<array.length; i++) {

            int smallestNumPointer = i;
            int j;
            for( j=i; j<array.length-1; j++ ){
                if(array[smallestNumPointer] > array[j+1] ){
                   smallestNumPointer = j+1;
                }
            }
            int temp = array[smallestNumPointer];
            array[smallestNumPointer] = array[i];
            array[i] = temp;
        }


        return  array;
    }

    //2,5,8,9,5,6,3
    public static void main(String[] args) {
        int arr[] = new int[]{8,5,2,9,5,6,3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
