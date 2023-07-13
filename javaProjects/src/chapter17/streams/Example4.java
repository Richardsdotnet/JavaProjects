package chapter17.streams;

import tdd.Account;

import java.util.Random;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        Random random = new Random();

        Stream<Integer>stream = Stream.generate(() -> random.nextInt(9)).limit(9)
                        .limit(5);
        stream.forEach((num) -> System.out.println(num));
    }
}
