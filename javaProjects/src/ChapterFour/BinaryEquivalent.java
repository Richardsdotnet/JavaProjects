package ChapterFour;

import java.util.Scanner;

public class BinaryEquivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary integer");
        int binary = input.nextInt();
        int decimal= inputConvert(binary);
        System.out.println("The decimal equivalent of  " + binary + " is " + decimal);

        zerosAndOnes(1011);
    }

        public  static int inputConvert(int binary){
        int decimal = 0;
        int count = 0;
        while (binary != 0){
            int digit = binary % 10;
            decimal += digit * Math.pow(2, count);
            binary /= 10;
            count++;
        }
        return decimal;
        }

    public static void zerosAndOnes(int userInput){
        int sum =0;
        int counter = 1;
        while (userInput != 0) {
            if (userInput % 10 == 1){
                sum  += counter;
                userInput /= 10;
            }else {
                userInput/=10;
            }
            counter *= 2;
        }
        System.out.println("the value is: " + sum);
    }
}
