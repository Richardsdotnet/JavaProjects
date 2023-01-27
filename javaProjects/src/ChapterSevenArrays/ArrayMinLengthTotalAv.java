package ChapterSevenArrays;

import java.util.Scanner;


public class ArrayMinLengthTotalAv {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int [] array = new int[3];
       int min;
       int total = 0;
        double average = 0;
        int count = 0;
        System.out.println("Enter " + array.length + " Values");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            count += 1;
            total += array[i];
        }
        average = (double) total / count;
        min = array[0];
        for (int i : array){
            if (i < min) min = i;
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The length of the array is: " + array.length);
        System.out.println("The sum of the array is: " + total);
        System.out.println("The average of the array is: " + average);


    }
}







            
            



