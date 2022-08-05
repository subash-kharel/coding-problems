package main.java.fibonacci;

public class Runner {


    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        long timeInMilis = System.currentTimeMillis();
        System.out.println("This is the start time for fib(45) :"+ timeInMilis);
        System.out.println( "recrusive fib at 45: " + fibonacci.fib(45));
        long timeInMilisEnd = System.currentTimeMillis();
        System.out.println("Time taken to run fib(50) :" + ((timeInMilisEnd - timeInMilis )/1000) + " secs");
        System.out.println("----------------------------------------------------------");

        long timeInMilis1 = System.currentTimeMillis();
        System.out.println("This is the start time for fib(45) :"+ timeInMilis1);
        System.out.println( "iterative fib at 45: " + fibonacci.fibIterative(45));
        long timeInMilisEnd1 = System.currentTimeMillis();
        System.out.println("Time taken to run fib(50) :" + ((timeInMilisEnd1 - timeInMilis1 ) + " millisec"));
        System.out.println("----------------------------------------------------------");


        long timeInMilis2 = System.currentTimeMillis();
        System.out.println("This is the start time for fib(45) :"+ timeInMilis2);
        System.out.println( "recrusive fib at 45: " + fibonacci.fibDynamic(45));
        long timeInMilisEnd2 = System.currentTimeMillis();
        System.out.println("Time taken to run fib(50) :" + ((timeInMilisEnd2 - timeInMilis2 )/1000) + " secs");
    }
    }


