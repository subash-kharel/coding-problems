package main.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquaredArray {

    //O(nlogn) time complexity, O(n) space
    public static int[] sortedSquaredArray(int[] array){
        int[] squaredArray = new int[array.length];

        for(int i =0; i< array.length; i++){
            squaredArray[i] = array[i] * array[i];
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }

    public static void main(String[] args) {

     int[] arr = new int[]{1,2,3,5,6,8,9};

        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }
}
