package BankApp;



public class Account {
    private int balance;
    private String pin;


    private int accountNumber;
    private String accountName;

    public Account(int accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;

    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int checkBalance(String pin) {
        if (pinIsCorrect(pin)) return balance;
        return 0;
    }

    private boolean pinIsCorrect(String pin) {
        return  this.pin.equals(pin);
    }

    public void withdraw(int amount, String pin) {
        if (pinIsCorrect(pin)) balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
}

}

