package ChapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        while (true){
            System.out.println("Enter the hours parked");
            double hours = input.nextDouble();
            double charge = calculateCharges(hours);
            System.out.println("Charge: $" + charge);
            totalReceipts += charge;
            System.out.println("Enter n to enter next customer");
           String anotherCustomer = input.next();
           if(!anotherCustomer.equals("n")){
               break;
            }

        }
        System.out.printf("Total receipts: $" + totalReceipts);
    }

    public static  double calculateCharges(double hours) {
        double charge = 2.00;
        if (hours <= 3.0) {
            return charge;
        } else{
            charge += 0.5 * Math.ceil(hours - 3.0);
            return Math.min(charge, 10.0);
        }

    }
}







