import java.util.Scanner;

public class SuperMarketMain {

    public static void main(String[] args) {
        int replayMenu = 0;
        SuperMarket superMarket = new SuperMarket();
        Scanner input = new Scanner(System.in);
        superMarket.MenuSelection();
         replayMenu = input.nextInt();

        while (replayMenu != -1){
                superMarket.MenuSelection();
                replayMenu++;

            }
                System.out.println("Thank you for yourrrr patronage");
            }
        }



