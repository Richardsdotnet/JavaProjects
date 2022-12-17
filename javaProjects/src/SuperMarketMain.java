import java.util.Scanner;

public class SuperMarketMain {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        Scanner input = new Scanner(System.in);
        superMarket.MenuSelection();
        int replayMenu = input.nextInt();
        while (replayMenu == 1){
            if (replayMenu == 1){
                superMarket.MenuSelection();
            }else {
                System.out.println("Thank you for your patronage");
            }
        }

    }
}
