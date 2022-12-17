public class Account {
    private String name;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double cash) {
        if (cash > 0) this.balance = balance + cash;
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("insufficient funds");
        }
        else if (amount > 0 && amount < balance)
            balance -= amount; // balance = balance - amount
        else
        {
            System.out.println("Invalid transaction");

        }
    }
}