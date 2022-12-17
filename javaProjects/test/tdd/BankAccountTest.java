package tdd;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Remi", 50);
        System.out.println("initial name is : " + account.getName());
        System.out.println(account.getBalance());
        account.setName("Ritch");
        System.out.println("new name is : " + account.getName());
    }
}
