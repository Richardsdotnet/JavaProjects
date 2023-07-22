package chapter17.streams;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> words = List.of(
             "Java", "Python",
             "C++", "Go",
             "Rust","Java", "Python", "C++"
        );
        Function<String, String> keyMapper = (word) -> word;
        Function<String, Integer> valueMapper = (word) -> word.length();
        BinaryOperator<Integer> mergeFunction = (word, duplicate) -> word + duplicate;

        Map<String,Integer> languages = words.stream()
                .filter((word) -> word.length() > 2)
                .collect(Collectors.toMap(keyMapper, valueMapper,
                        mergeFunction, () -> new TreeMap<>()));
        System.out.println(languages);

        //sorting alg
        Collections.sort(words);
        int index = Collections.binarySearch(words, "python");
        System.out.println("python at index: " + index);
        String  maximum = Collections.max(words);
        System.out.println(maximum);

        System.out.println(words);

    }
}
