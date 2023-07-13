package chapterEleven;

import java.util.Scanner;

public class ExceptionsExp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-digit number");
        String number = input.next();
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i) < '0' || number.charAt(i) > '9'){
                throw new RuntimeException("Have some sense!!");
            }
        }
        System.out.println("You entered:" + number);
    }
}
