package ChapterTen.Polymorphism;

public class Bank {
    public static void main(String[] args) {
        SavingsAccount malikAccount = new SavingsAccount("teens");
        malikAccount.deposit(1200);
        malikAccount.withdraw(200);
        System.out.println(malikAccount.getBalance());
        malikAccount.deposit(4000);
        System.out.println(malikAccount.getBalance());
    }
}
