package ChapterFive;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter triangle length");
        int n = input.nextInt();

        for (int row = 0; row <= n ; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");

            }
            for (int column = row; column <= n; column++) {
                System.out.print("  ");

            }
            for (int column = row; column <= n; column++) {
                System.out.print("* ");

            }
            for (int column = 0; column <= row; column++) {
                System.out.print("  ");

            }for (int column = 0; column <= row; column++) {
                System.out.print("  ");

            }
            for (int column = row; column <= n; column++) {
                System.out.print("* ");

            }
            for (int column = row; column <= n; column++) {
                System.out.print("  ");

            }

            for (int column = 0; column <= row; column++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
