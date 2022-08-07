package main.java.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){

        int nextValue = 0;
        for(int i = 1; i<array.length; i++){
            nextValue = array[i];
            int j;
            for( j=i-1; j>=0;j--){
                if(array[j] > nextValue){
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = nextValue;

        }
        return array;
    }

    public static int[] insertionSort1(int[] array){

        int nextValue = 0;
        for(int i = 1; i<array.length; i++){
            nextValue = array[i];

            int j = i-1;
            while(j>=0 && array[j] > nextValue){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = nextValue;
        }
        return array;
    }

    public static void main(String[] args) {

        //5,8,2,9,5,6,3
        //
        int arr[] = new int[]{8,5,2,9,5,6,3};
        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(insertionSort1(arr)));
    }
}
