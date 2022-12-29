package ChapterFour.ChristmasSnacks;

import java.util.Scanner;

public class SalesCalculator {
    double product1 = 0;
    double product2 = 0;
    double product3 = 0;
    double product4 = 0;
    double product5 = 0;
    int productNumber;
    int productQuantity;
    double totalAmount;


   public void productQuantity(){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter product number");
       productNumber = input.nextInt();
       System.out.println("Enter product quantity");
       productQuantity = input.nextInt();

       int item = 1;
       while (productNumber != -1) {
           System.out.println("Enter product number");
           productNumber = input.nextInt();
           System.out.println("Enter product quantity");
           productQuantity = input.nextInt();
       switch (productNumber){
           case 1 -> product1 = 2.98 * productQuantity;
           case 2 -> product2 = 4.50 * productQuantity;
           case 3 -> product3 = 9.98 * productQuantity;
           case 4 ->product4 = 4.49 * productQuantity;
           case 5 -> product5 = 6.87 * productQuantity;
           default -> {
               System.out.println("invalid number, select from 1-5");
               continue;
           }
       }
       item++;
   }
    totalAmount = product1 + product2 + product3 + product4  + product5;
       System.out.printf("The total value of products is: %s%n", totalAmount);
   }


}

