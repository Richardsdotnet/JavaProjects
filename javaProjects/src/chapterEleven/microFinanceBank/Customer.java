package chapterEleven.microFinanceBank;

import java.math.BigDecimal;
import java.util.List;

public class Customer {
    private String name;
    private BigDecimal balance;
    private List<Transaction> transactionHistory;


    public Customer(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;

    }

    public String withdraw(double amount) throws TrenchesException {
        if (balance.compareTo(BigDecimal.valueOf(amount)) < 0)
            throw new TrenchesException("sapa bien merci");
            balance = balance.subtract(BigDecimal.valueOf(amount));
            return "WITHDRAWAL SUCCESSFUL";

        }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

