import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter name");

        String name = input.nextLine();

        account.setName(name);

        account.deposit(50000);

        System.out.printf("The balance is %.2f%n", account.getBalance());

        account.withdraw(-6000);

        System.out.printf("The new balance is %.2f%n", account.getBalance());



    }
}
