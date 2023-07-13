package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ListReversal {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " numbers");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int newList = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    newList = array[i];
                    array[i] = array[j];
                    array[j] = newList;

                }
            }

            }
        System.out.println("The sorted list is: " + newList);
        }
}

