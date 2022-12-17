package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositMoneyTest(){
        //given that Chris has an account
        Account chrisAccount = new Account();
        //when he deposits 4000
        chrisAccount.deposit(4000);
        //check that the balance is 4000
        int balance = chrisAccount.getBalance();
        assertEquals(4000, balance);

    }
    @Test
    public void depositTwiceTest(){
        //given chris has an account;
        Account chrisAccount = new Account();
        //given there is 300 in the account;
        chrisAccount.deposit(300);
        int balance = chrisAccount.getBalance();
        //when i try to deposit 200;
        chrisAccount.deposit(200);
        //check that the balance is 500;
        balance = chrisAccount.getBalance();
        assertEquals(500, balance);


    }
    @Test
    public  void depositNegativeAmount() {
        //giving i have an account with zero balance;
        Account chrisAccount = new Account();
        //when i try to deposit negative amount(-2300);
        chrisAccount.deposit(-2300);
        //check that balance is zero;
        int balance = chrisAccount.getBalance();
        assertEquals(0, balance);

    }

    @Test

    public void withdraw(){
        //giving i have an account
        Account chrisAccount = new Account();
        // i want to deposit  money into the account;
        chrisAccount.deposit(10000);
              // i want to withdraw money;
        chrisAccount.withdraw(5000);
        // i want to check balance after deposit;
        int balance = chrisAccount.getBalance();
        assertEquals(5000, balance);


    }
    @Test
    public void deposit(){
        //giving i have an account
        Account chrisAccount = new Account();
        // i want to deposit money
        chrisAccount.deposit(600);
        // i want to check balance after deposit
        int balance = chrisAccount.getBalance();
        assertEquals(600, balance);

    }



}

