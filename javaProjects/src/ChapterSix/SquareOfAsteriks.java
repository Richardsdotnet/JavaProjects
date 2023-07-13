package ChapterSix;

import java.util.Scanner;

public class SquareOfAsteriks {
    public void size() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of square");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(" ");
            for (int j = 0; j < size; j++) {
                System.out.print("*");

            }
        }
    }


    public static void main(String[] args) {
        SquareOfAsteriks squareOfAsteriks = new SquareOfAsteriks();
        squareOfAsteriks.size();
    }
}