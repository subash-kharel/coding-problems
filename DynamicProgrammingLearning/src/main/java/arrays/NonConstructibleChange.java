package main.java.arrays;

import java.util.Arrays;

public class NonConstructibleChange {


    //key to solution is that if the sum sorted values is less than next value we have constructible changes
    public static int nonConstructibleChange(int[] coins){
        Arrays.sort(coins);
        int currentChange = 0;
        for(int coin: coins){
            if(coin > currentChange +1){
                return currentChange +1;
            }
            currentChange += coin;
        }
        return currentChange + 1;
    }


    public static void main(String[] args) {
        int[]  coins = new int[]{1,2,5};
        int[]  coins1 = new int[]{5,7,1,1,2,3,22};
        //sorted {1,1,2,3,5,7,22}
        System.out.println(nonConstructibleChange(coins));
        System.out.println(nonConstructibleChange(coins1));
    }
}
