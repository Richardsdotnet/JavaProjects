package tdd;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Remi", 50);
        System.out.println("initial name is : " + account1.getName());
        account1.setName("Ritch");
        System.out.println("New account name: " + account1.getName());
        System.out.println(account1.getBalance());
        BankAccount account2 = new BankAccount("Chris", 20);
        System.out.println("Account2: name: " + account2.getName());
        System.out.println("Account2: balance: " + account2.getBalance());

    }
}
