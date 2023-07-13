package chapter17.streams;

import java.util.Set;
import java.util.stream.Stream;

public class StreamsExp {
    public static void main(String[] args) {
        //collection
        Set<String> peeps = Set.of(
                "Maleek",
                "Women Leader",
                "Joey",
                "chris"
        );

        //stream
        Stream<String> people = Stream.of(
                "Maleek",
                "Women Leader",
                "Joey",
                "chris"
        );
        peeps.stream().forEach((peep) -> System.out.println(peep));
        System.out.println("=".repeat(50));
        people.forEach((person) -> System.out.println(person));
    }
}
