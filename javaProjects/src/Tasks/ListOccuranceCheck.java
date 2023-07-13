package Tasks;

import java.util.Scanner;

public class ListOccuranceCheck {

    public static class OccuranceCheck {
        public static void main(String[] args) {
            int[] numbers = {1, 3, 5, 8, 9, 23, 45};
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number to check on the list");
            int targetNumber = input.nextInt();
            boolean isInList = false;
            for (int number: numbers) {
                if (number == targetNumber){
                    isInList = true;
                    break;}
            }
            if (isInList){
                System.out.println("Number " + targetNumber + " is on the list");
            }else {
                System.out.println("Number" + targetNumber + " is not on the list");
            }

        }
    }

}
