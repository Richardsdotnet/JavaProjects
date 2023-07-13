package ChapterSevenArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(numbers);

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println(numbers );

        }System.out.println();
    }
}
