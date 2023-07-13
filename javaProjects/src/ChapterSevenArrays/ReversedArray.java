package ChapterSevenArrays;

import java.util.Arrays;

public class ReversedArray {


    public static int[] arrayReverse(int[] input) {
        int [] reversed = new  int[4];
        int counter = 0;
        int[] numbers = {2, 3, 4, 5};
        for (int i = numbers.length - 1; i >= 0; i--) {
             reversed[counter] = numbers[i];
             counter++;

        }
        System.out.println(Arrays.toString(reversed));

        return reversed;
    }




public static void main(String[] args) {
    int[] numbers = {2, 3, 4, 5};
        arrayReverse(numbers);
    }
}


