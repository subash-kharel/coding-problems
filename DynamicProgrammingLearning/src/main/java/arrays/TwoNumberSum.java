package main.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    //O(n^2) time | O(1)
    public static int[] twoNumberSumIterative(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int mayBeTargetSum = arr[i]+arr[j];
                if(mayBeTargetSum == target){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{};
    }

    //O(n) time  | O(n) space
    public static int[] twoNumberSumIterative1(int[] arr, int target){
        Set<Integer> nums = new HashSet<>();
        for(int num: arr){
            int potentialTarget = target - num;
            if(nums.contains(potentialTarget)){
                return new int[]{potentialTarget, num };
            } else {
                nums.add(num);
            }
        }

        return new int[]{};
    }

    //O(nlog(n)) time  | O(1) space
    public static int[] twoNumberSumIterative2(int[] arr, int target){

        Arrays.sort(arr);
        //-4,-1,1,3,5,6,8,11
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == target) {
                return new int[] { arr[right], arr[left]};
            } else if (currentSum < target) {
                left++;
            } else if(currentSum > target){
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = new int[] {3,5,-4,8,11,1,-1,6};
        int target = 10;
        System.out.println(Arrays.toString(twoNumberSumIterative(array, target)));
        System.out.println(Arrays.toString(twoNumberSumIterative1(array, target)));
        System.out.println(Arrays.toString(twoNumberSumIterative2(array, target)));

    }
}
