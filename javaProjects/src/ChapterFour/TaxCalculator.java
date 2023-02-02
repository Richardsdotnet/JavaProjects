package ChapterFour;

import java.util.Scanner;

public class TaxCalculator {
    String citizenName;
    int earning;
    double totalTax;

    Scanner input = new Scanner(System.in);

    public void citizenName(){

        System.out.println("Enter citizen name");
         citizenName = input.nextLine();
        System.out.println("Enter citizen earnings");
        earning = input.nextInt();



    }
    public void citizenEarningTax(){

        //System.out.println("Enter citizen Earning");
        // earning = input.nextInt();
         //int counter;
         //for(counter = 0; counter <= 4; counter++)
        if(earning < 30000){
            totalTax =(double) 15/100 * earning;
            System.out.printf("Total citizen tax is: %f%n", totalTax);

        } else {
            totalTax =(double) 20/100 * earning;
            System.out.printf("Total citizen tax is: %f%n", totalTax);

        }

    }


}
