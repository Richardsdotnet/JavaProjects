package ChapterSevenArrays;

import java.util.Scanner;

public class SalesSlip {
        Scanner scanner = new Scanner(System.in);
        private final int[][] productsTotal = new int[5][4];
        public void displayHeader(){
            System.out.print("          ");
            int numberOfSalesPersons = 4;
            for (int i = 0; i < numberOfSalesPersons; i++) {
                System.out.print("    persons " + (i + 1));
            }
            System.out.println("      Total");
        }
        public void TotalPrice(){
            for (int i = 0; i < productsTotal.length; i++) {
                int j;
                for (j = 0; j < productsTotal[i].length; j++) {
                    System.out.println("Total amount of Product" + (i + 1) + " sold by sales person " + (j + 1) + " is:");
                    int totalAmount = scanner.nextInt();
                    productsTotal[i][j] = totalAmount;
                }
                System.out.println();
            }
        }

                public void displaySlip() {
                    displayHeader();
                    for (int i = 0; i < productsTotal.length; i++) {
                        int sum = 0;
                        System.out.print("Product" + (i + 1));
                        //System.out.print("     ");
                        for (int j = 0; j < productsTotal[i].length; j++) {
                            System.out.print("           ");
                            System.out.print(productsTotal[i][j]);
                            sum += productsTotal[i][j];
                        }
                        System.out.print("              ");
                        System.out.println(sum);
                    }
                }

            }
