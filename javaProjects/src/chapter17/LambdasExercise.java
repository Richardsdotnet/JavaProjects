package chapter17;

import java.util.stream.IntStream;

public class LambdasExercise {
    public static void main(String[] args) {
        int sum = IntStream
                .rangeClosed(1,10)
                .sum();
        System.out.println("sum of no from 1 to 10 = " + sum);
    }
}
