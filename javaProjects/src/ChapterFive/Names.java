package ChapterFive;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        System.out.println("Enter 4 numbers");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int numbers = input.nextInt();
            sum += numbers;
        }
        System.out.println("The sum of the numbers inputted is:" + sum);
    }


}
