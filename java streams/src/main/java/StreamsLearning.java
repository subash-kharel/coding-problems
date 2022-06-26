package main.java;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsLearning {


    public static void main(String[] args) {
        //get stream of numbers
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

        //stream of array
        Stream<Integer> streamArr = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamArr.forEach(p -> System.out.println(p));

        //
        System.out.println("----------------------------");
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100)).limit(20);
        randomNumbers.forEach(System.out::println);





    }



}
