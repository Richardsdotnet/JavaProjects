package ChapterFour;

import java.util.Scanner;

public class CommissionCalculator {
    int itemCounter;
    int totalItem;
    int  totalAmount;
    double percentageBonus = 0.09;
    Scanner input = new Scanner(System.in);

    public void itemsSold() {
        int item = 0;
        while (item != -1) {
            System.out.println("Enter item sold");
            item = input.nextInt();
            totalItem = totalItem + item;
            itemCounter += 1;
        }
    }


       public void amountOfItem(){
            int amount = 0;
            while (amount != -1){
                System.out.println("Enter item Amount");
                amount = input.nextInt();
                totalAmount = totalAmount + amount;
                itemCounter += 1;
            }

        }

        public void salesPersonEarning(){
        double salesPersonEarning = 200+ (percentageBonus * totalAmount);
            System.out.printf("Total sales earnings: %f%n", salesPersonEarning);
        }

    }
