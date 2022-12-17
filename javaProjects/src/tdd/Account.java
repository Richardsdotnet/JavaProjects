 package tdd;

public class Account {

    private int balance;
    public void deposit(int amount) {
       if(amount >= 0) balance = amount + balance;
    }

    public int getBalance() {

        return balance;
    }
    public int withdraw(int amount) {

        return balance =balance - amount;
    }

}


