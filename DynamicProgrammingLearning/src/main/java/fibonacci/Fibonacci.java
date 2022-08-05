package main.java.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {


    public long fib(long n){
        if (n <= 2){
            return 1;
        }
        return fib(n-2)+ fib(n-1);
    }

    public long fibIterative(long n){
        long fibSum = 0;
        long prev = 1;
        long next = 1;
        if (n <=2 && n >=1) {
            return 1;
        } else {
            for(long i=2; i < n; i++){
                fibSum = prev + next; //2, 3,
                prev = next;// 1, 2,
                next = fibSum;//2, 3
            }
        }
        return fibSum;
    }

    public long fibDynamic(int n) {
        //1,1,2,3
        Map<Integer, Long> memoize = new HashMap<>();
        memoize.put(1, 1L);
        memoize.put(2, 1L);
        return fibDynamic(  n,  memoize);

    }
    public long fibDynamic(int n, Map<Integer, Long> memoize){
        if(memoize.containsKey(n)){
            return memoize.get(n);
        } else {
           memoize.put(n, fibDynamic(n-1, memoize) + fibDynamic(n-2, memoize));
           return memoize.get(n);
        }
    }
}
