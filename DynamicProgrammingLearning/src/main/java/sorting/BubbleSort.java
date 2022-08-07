package main.java.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array){

        int lengthOfArray = array.length;
        for(int i =0; i< lengthOfArray; i++){
            for(int j= 0; j< lengthOfArray-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1]= array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{8,5,2,9,5,6,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
}
