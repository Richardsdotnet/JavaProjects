package chapter17.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAlgorithm {
    public static long countSpecialCharacters(String[] strings) {
        String specialCharacters = "!@#$%&*()_-+=[]{}/`<.>~\"'";
        long numberOfSpecialCharacters = Arrays.stream(strings)
                .flatMap((element) -> {
                    String[] arr = element.split("");
                    return Stream.of(arr);
                })
                .filter((element) -> specialCharacters.contains(element))
                .count();

    return numberOfSpecialCharacters;
    }
}
