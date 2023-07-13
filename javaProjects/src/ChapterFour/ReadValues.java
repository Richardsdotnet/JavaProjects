package ChapterFour;

import java.util.Scanner;

public class ReadValues {
    public static void integers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        int sum = 0;

       while ( firstNumber > sum){
           System.out.println("Enter a Number");
           int number = input.nextInt();
           sum += number;
       }

        System.out.println(sum);
    }



    public static void main(String[] args) {
        integers();
    }
}