package ChapterSevenArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestCommonMultiple {
    public static int [] returnLcmOfInteger(int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number > 0 && number % i == 0) {
                numbers.add(i);
                number = number/i;
            }
        }
        int [] newArray = new int [numbers.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=numbers.get(i);

        }


        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnLcmOfInteger(8)));
    }
}
