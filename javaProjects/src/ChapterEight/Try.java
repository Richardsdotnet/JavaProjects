package ChapterEight;

import java.util.Arrays;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
//        int[] numbers = {12, 3, 6, 20};
//        ArrayList<Integer> newList = new ArrayList<>();
//
//            for (int i = numbers.length-1; i >= 0; i--) {
//                newList.add(numbers[i]);
//            }
//        System.out.println(newList);

//        int numberRange = 100;
//        for (int i = 1; i <= numberRange; i++) {
        // fizzBuzz(i);
//        }

//        public static void fizzBuzz(int i){
//            if (i % 3 == 0 && i % 5 == 0) System.out.println("fizzBuzz");
//                else if (i % 5 == 0) System.out.println("Buzz");
//                else if(i % 3 == 0) System.out.println("Fizz");
//                else System.out.println(i);
//        }
//
//
//

        Guests guests = new Guests();
        Guests.invitedGuests();
        //  Guests.checkGuests();
    }

    public static class Guests {
        // private String [] guests;
        public static String[] invitedGuests() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of guest");
            int guestNumber = scanner.nextInt();
            String[] guests = new String[guestNumber];
            System.out.println("Enter names of " + guests.length + " guests");
            for (int i = 0; i < guests.length; i++) {
                guests[i] = scanner.next();
            }
            System.out.println("Guests complete");
            System.out.println(Arrays.toString(guests));
            System.out.println("Enter guest Name");
            String name = " ";
            name = scanner.nextLine();
            for (String guest : guests) {
                if (name.equals(guest)) System.out.println("Invited");
                else System.out.println("Not invited");
            }
            return guests;
        }
    }

}











