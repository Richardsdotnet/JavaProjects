import java.util.Scanner;

public class SuperMarket {
    public void MenuSelection() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("press 1 for book\n press 2 for bag\n press 3 for shoe\n ");
        int selectMenu = userInput.nextInt();
        if (selectMenu == 1) {
            int priceOfBook = 200;
            System.out.println("how many books do you want to buy?");
            int numberOfBooks = userInput.nextInt();
            int totalAmountOfBooks = numberOfBooks * priceOfBook;
            System.out.printf("Total Amount %d books is %d%n", numberOfBooks, totalAmountOfBooks);
        } else if (selectMenu == 2) {
            int priceOfBag = 300;
            System.out.println("how many books do you want to buy?");
            int numberOfBags = userInput.nextInt();
            int totalAmountOfBags = numberOfBags * priceOfBag;
            System.out.printf("Total amount of %d bags is %d%n", numberOfBags, totalAmountOfBags);
        } else if (selectMenu == 3) {
            int priceOfShoe = 500;
            System.out.println("how many shoes do you want to buy?");
            int numberOfShoes = userInput.nextInt();
            int totalAmountOfShoes = numberOfShoes * priceOfShoe;
            System.out.printf("Total amount of %d bags is %d%n", numberOfShoes, totalAmountOfShoes);
        } else {
            System.out.println("invalid input");
            System.out.println("Do you wish to Continue? press yes to continue, press no to terminate");
        }

    }
}



