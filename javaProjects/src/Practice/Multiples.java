package Practice;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Enter first integer");

     int firstNum = input.nextInt();

     System.out.println("Enter second integer");

     int secondNum = input.nextInt();
        int doubled = secondNum * 2;
        int tripled = firstNum * 3;
     if (tripled % doubled == 0)

         System.out.println("Result is" +   doubled / tripled);


    }
}
