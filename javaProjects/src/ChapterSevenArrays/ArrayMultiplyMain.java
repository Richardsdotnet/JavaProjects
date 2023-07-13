package ChapterSevenArrays;

import java.util.Arrays;

public class ArrayMultiplyMain {
    public static void main(String[] args) {
        ArrayMultiply arrayMultiply = new ArrayMultiply();
        int [] array = {2, 4, 6, 3, 5, 1};
        System.out.println(Arrays.toString(arrayMultiply.multiplyIndex(array)));
        System.out.println(Arrays.toString(arrayMultiply.ascendingSort(array)));
        System.out.println(Arrays.toString(arrayMultiply.descendingSort(array)));
    }
}
