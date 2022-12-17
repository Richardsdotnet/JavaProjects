package Practice;

import java.util.Scanner;
public class Largest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        if (number % 3 == 0)
            System.out.printf("The number is divisible by %d%n", 3);

    }
}
