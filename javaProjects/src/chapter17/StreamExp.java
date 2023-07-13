package chapter17;

import java.util.ArrayList;
import java.util.List;

public class StreamExp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        numbers.stream()
                .filter((number) ->number%2!=0)
                .forEach((number) -> System.out.println(number));

    }


}
